package com.allstates.training.controller;


import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

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

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProductDao productDao=new ProductDaoImpl();
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setHeader("Cache-control", "no-cache,no-store,must revaliate");
		response.setHeader("Pragma", "no-cache");
		HttpSession session=request.getSession(false);
		out.print((String)session.getAttribute("sname"));
		out.print(session.getLastAccessedTime());
		RequestDispatcher rd=request.getRequestDispatcher("menu.html");
		List<Product> products=productDao.getProducts();
		out.print("<table border='1'><tr>");
		out.print("<th> Product id</th>");
		out.print("<th> Product name</th>");
		out.print("<th>Cost</th>");
		out.print("<th> quantity</th>");
		out.print("</tr>");
		for(Product p:products)
		{
			out.print("<tr>");
			out.print("<td>"+p.getPid()+"</td>");
			out.print("<td>"+p.getPname()+"</td>");
			out.print("<td>"+p.getCost()+"</td>");
			out.print("<td>"+p.getQty()+"</td>");
			out.print("<td><a href='edit?pid="+p.getPid()+"'>Edit</td>");//?-->requestvalue;
			out.print("</tr>");
			
		}
		out.print("</table>");
		rd.include(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
