package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AdminBean;

import dao.AdminDao;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username=request.getParameter("Username");
		String Password=request.getParameter("Password");
		AdminBean AdminBean = new AdminBean();
		AdminBean.setUsername(Username);
		AdminBean.setPassword(Password);
		 AdminDao AdminDao = new AdminDao();
		 String Registered = AdminDao.preetam(AdminBean);
		 if(Registered.equals("mahitha")) 
		 {
		 request.getRequestDispatcher("/Admin.jsp").forward(request, response);
		 }
		 else if(Registered.equals("chandana")) 
		 {
		 request.getRequestDispatcher("/Tr.jsp").forward(request, response);
		 }
		 else if(Registered.equals("nagaraj")) 
		 {
		 request.getRequestDispatcher("/Hr.jsp").forward(request, response);
		 }
		 else   
		 {
		 request.setAttribute("errMessage",Registered);
		 request.getRequestDispatcher("/Register.html").forward(request, response);
		 } 
		}

	}