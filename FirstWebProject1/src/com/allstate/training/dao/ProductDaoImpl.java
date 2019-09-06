package com.allstate.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;


import com.allstate.training.dao.ProductDao;
import com.allstate.training.pojos.Product;
import com.allstate.training.util.Dbutil;


public class ProductDaoImpl implements ProductDao {
	Connection con=null;
	public ProductDaoImpl()
	{
	
			con=Dbutil.getConnection();
	}

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			PreparedStatement pst=con.prepareStatement("insert into product (pname,cost,qty) values(?,?,?)");
			//pst.setInt(1,p.getPid());
			pst.setString(2,p.getPname());
			pst.setInt(3,p.getCost());
			pst.setInt(4,p.getQty());
		 i=pst.executeUpdate();
			
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public int updateQty(int pid, int qty) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst=con.prepareStatement("update product  set qty=? where productid=?");
			pst.setInt(1, qty);
			pst.setInt(2, pid);
			int i=pst.executeUpdate();
			if(i>0)
				System.out.println("updated successfully");
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateCost(int pid, int cost) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement pst=con.prepareStatement("update product  set cost=? where productid=?");
			pst.setInt(1, cost);
			pst.setInt(2, pid);
			int i=pst.executeUpdate();
			if(i>0)
				System.out.println("updated successfully");
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteProduct(int pid) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst=con.prepareStatement("delete from product where productid=?");
			pst.setInt(1,pid);
			int i=pst.executeUpdate();
			if(i>0)
				System.out.println("deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		Product p=new Product();
		try {
			PreparedStatement st=con.prepareStatement("select * from product where productid=?");
			st.setInt(1, pid);
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setCost(rs.getInt(3));
			p.setQty(rs.getInt(4));
		    }
			rs.close();
			st.close();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		List<Product> li=new ArrayList<>();
		
		try {
			PreparedStatement st=con.prepareStatement("select * from product");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				Product p=new Product();p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setCost(rs.getInt(3));
			p.setQty(rs.getInt(4));
			li.add(p);
		    }
			rs.close();
			st.close();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return li;
	}

	@Override
	public int updateProduct(Product p) {
		// TODO Auto-generated method stub
		int i1=0;
		PreparedStatement pst;
		try {
			pst = con.prepareStatement("update product set qty=?, cost=?, pname=? where productid=?");
			pst.setInt(1, p.getQty());
			pst.setInt(2, p.getCost());
			pst.setString(3, p.getPname());
			pst.setInt(4,p.getPid() );
			i1=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i1;
	}
}
