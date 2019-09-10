package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ApplyBean;
import bean.HrBean;
import dao.ApplyDao;
import dao.HrDao;


public class HrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public HrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Candidate_name=request.getParameter("Candidate_name");
		String Hr_name=request.getParameter("Hr_name");
		String Role=request.getParameter("Role");
		String Comm_skills=request.getParameter("Comm_skills");
		String Group_work=request.getParameter("Group_work");
		String Interperonalskills=request.getParameter("Interperonalskills");
		String Spontaneity=request.getParameter("Spontaneity");
		String Dependability=request.getParameter("Dependability");
		String Adaptability=request.getParameter("Adaptability");
		String Intiative=request.getParameter("Intiative");
		String Learn=request.getParameter("Learn");
		String Improve=request.getParameter("Improve");
		String Work=request.getParameter("Work");
		int Rating=Integer.parseInt(request.getParameter("Rating"));
		int Reasons=Integer.parseInt(request.getParameter("Reasons"));
		
		HrBean HrBean = new HrBean();
		
		HrBean.setCandidate_name(Candidate_name);
		HrBean.setHr_name(Hr_name);
		HrBean.setRole(Role);
		HrBean.setComm_skills(Comm_skills);
		HrBean.setGroup_work(Group_work);
		HrBean.setInterperonalskills(Interperonalskills);
		HrBean.setSpontaneity(Spontaneity);
		HrBean.setDependability(Dependability);
		HrBean.setAdaptability(Adaptability);
		HrBean.setIntiative(Intiative);
		HrBean.setLearn(Learn);
		HrBean.setImprove(Improve);
		HrBean.setWork(Work);
		HrBean.setRating(Rating);
		HrBean.setReasons(Reasons);
		
        HrDao HrDao = new HrDao();
		 
		 String adminHr= HrDao.Hr(HrBean);
		 
		 
		 
		 if(adminHr.equals("SUCCESS")) 
		 {
		 request.getRequestDispatcher("/viewemp.jsp").forward(request, response);
		 }
		 else   
		 {
		 request.setAttribute("errMessage", adminHr);
		 request.getRequestDispatcher("/Register.html").forward(request, response);
		 } 
		}
		



		

	}


