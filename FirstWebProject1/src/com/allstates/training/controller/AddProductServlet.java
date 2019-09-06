package com.allstates.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.allstate.training.dao.ProductDao;
import com.allstate.training.dao.ProductDaoImpl;
import com.allstate.training.pojos.Product;
import com.allstate.training.util.Dbutil;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/add")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProductDao productDao=new ProductDaoImpl();
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		response.setHeader("Cache-control", "no-cache,no-store,must revaliate");
		HttpSession session=request.getSession(false);
		out.print((String)session.getAttribute("sname"));
		Product p=new Product();
		String pid=(request.getParameter("id"));
		p.setPname(request.getParameter("name"));
		p.setCost(Integer.parseInt(request.getParameter("cost")));
		p.setQty(Integer.parseInt(request.getParameter("quantity")));
		if(pid.isEmpty())
		{int i=productDao.addProduct(p);
		if(i>0)
		{
		RequestDispatcher rd=request.getRequestDispatcher("Product");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("AddProduct.jsp");
			rd.forward(request, response);
		}
		}
		else
		{
			p.setPid(Integer.parseInt(pid));
			int i=productDao.updateProduct(p);
			if(i>0)
			{
			RequestDispatcher rd=request.getRequestDispatcher("Product");
			rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("AddProduct.jsp");
				rd.forward(request, response);
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
