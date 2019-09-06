package com.allstates.training.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allstate.training.dao.ProductDao;
import com.allstate.training.dao.ProductDaoImpl;
import com.allstate.training.pojos.Product;

/**
 * Servlet implementation class EditProduct
 */
@WebServlet("/edit")
public class EditProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDao productDao=new ProductDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid=Integer.parseInt(request.getParameter("pid"));
		Product p=productDao.getProductById(pid);
		request.setAttribute("prod", p);//variable prod having value p;
		RequestDispatcher rd=request.getRequestDispatcher("AddProduct.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
