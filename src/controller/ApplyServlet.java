package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ApplyBean;
import dao.ApplyDao;


public class ApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String title=request.getParameter("title");
		String firstname=request.getParameter("firstname");
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastname");
		String ftitle=request.getParameter("ftitle");
		String ffirstname=request.getParameter("ffirstname");
		String fmiddlename=request.getParameter("fmiddlename");
		String flastname=request.getParameter("flastname");
		String gender=request.getParameter("gender");
		String hno=request.getParameter("hno");
		String street=request.getParameter("street");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String city=request.getParameter("city");
		int pin=Integer.parseInt(request.getParameter("pin"));
		String email=request.getParameter("email");
		int num=Integer.parseInt(request.getParameter("num"));
		String qualification=request.getParameter("qualification");
		int y_o_p=Integer.parseInt(request.getParameter("y_o_p"));
		int academic_p=Integer.parseInt(request.getParameter("academic_p"));
		String specialization=request.getParameter("specialization");
		String languages_known=request.getParameter("languages_known");
		int experience=Integer.parseInt(request.getParameter("experience"));
		
		ApplyBean ApplyBean = new ApplyBean();
		
		ApplyBean.setTitle(title);
		ApplyBean.setFirstname(firstname);
		ApplyBean.setMiddlename(middlename);
		ApplyBean.setLastname(lastname);
		ApplyBean.setFtitle(ftitle);
		ApplyBean.setFfirstname(ffirstname);
		ApplyBean.setFmiddlename(fmiddlename);
		ApplyBean.setFlastname(flastname);
		ApplyBean.setGender(gender);
		ApplyBean.setHno(hno);
		ApplyBean.setStreet(street);
		ApplyBean.setState(state);
		ApplyBean.setCountry(country);
		ApplyBean.setCity(city);
		ApplyBean.setPin(pin);
		ApplyBean.setEmail(email);
		ApplyBean.setNum(num);
		ApplyBean.setQualification(qualification);
		ApplyBean.setY_o_p(y_o_p);
		ApplyBean.setAcademic_p(academic_p);
		ApplyBean.setSpecialization(specialization);
		ApplyBean.setLanguages_know(languages_known);
		ApplyBean.setExperience(experience);
		
		 ApplyDao ApplyDao = new ApplyDao();
		 
		 String UserApply= ApplyDao.Apply(ApplyBean);
		 
		 if(UserApply.equals("SUCCESS")) 
		 {
		 request.getRequestDispatcher("/Viewemp.jsp").forward(request, response);
		 }
		 else   
		 {
		 request.setAttribute("errMessage", UserApply);
		 request.getRequestDispatcher("/Register.html").forward(request, response);
		 } 
		}
	
	}


