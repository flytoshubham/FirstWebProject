package com.allstate.training.pojo;

import java.util.Scanner;

import com.java.allstates.training.Dao.ProductDao;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductDao productdao=new ProductDaoImpl();
		System.out.println("welcome 1. Add Product  2.Update cost 3. Update qty 4. delete product 5. Select Product by Id  6. Describe Product Table");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			Product p=new Product();
			System.out.println("enter pid");
			p.setPid(sc.nextInt());
			System.out.println("enter pname");
			p.setPname(sc.next());
			System.out.println("enter cost");
			p.setCost(sc.nextInt());
			System.out.println("enter qty");
			p.setQty(sc.nextInt());
			productdao.addProduct(p);
			break;
		case 2:
		       System.out.println("enter pid");
		       int pid=sc.nextInt();
		       System.out.println("enter new cost");
		       int cost=sc.nextInt();
		       productdao.updateCost(pid, cost);
		       break;
		case 3:
			System.out.println("enter pid");
		       int pid1=sc.nextInt();
		       System.out.println("enter new qty");
		       int qty=sc.nextInt();
		       productdao.updateQty(pid1, qty);
		       break;
		case 4:
			System.out.println("enter pid");
			int pid2=sc.nextInt();
			productdao.deleteProduct(pid2);
			break;
		case 5:
			System.out.println("enter pid");
			int pid3=sc.nextInt();
			System.out.println(productdao.getProductById(pid3));
			break;
		case 6:
			System.out.println(productdao.getProducts());
			break;
		default:
			System.out.println("invalid attempt");
			break;
			
		}
	}

}
