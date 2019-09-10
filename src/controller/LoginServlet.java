package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;
import dao.LoginDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Username=request.getParameter("Username");
	String Password=request.getParameter("Password");
	LoginBean LoginBean = new LoginBean();
	 LoginBean.setUsername(Username);
	 LoginBean.setPassword(Password);
	 LoginDao LoginDao = new LoginDao();
	 String userRegistered = LoginDao.registerUser(LoginBean);
	 if(userRegistered.equals("SUCCESS")) 
	 {
	 request.getRequestDispatcher("/Userpage.jsp").forward(request, response);
	 }
	 else   
	 {
	 request.setAttribute("errMessage", userRegistered);
	 request.getRequestDispatcher("/Login.jsp").forward(request, response);
	 } 
	}

}
