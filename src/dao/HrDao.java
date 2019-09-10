package dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.ApplyBean;
import bean.HrBean;
import util.DBConnection;

public class HrDao {
	public String Hr(HrBean hrbean)
	 {
		
		 String Candidate_name = hrbean.getCandidate_name();
		 String Hr_name=hrbean.getHr_name();
		 String Role=hrbean.getRole();
		 String Comm_skills=hrbean.getComm_skills();
		 String Group_work=hrbean.getGroup_work();
		 String Interperonalskills=hrbean.getInterperonalskills();
		 String Spontaneity=hrbean.getSpontaneity();
		 String Dependability=hrbean.getDependability();
		 String Adaptability=hrbean.getAdaptability();
		 String Intiative=hrbean.getIntiative();
		 String Learn=hrbean.getLearn();
		 String Improve=hrbean.getImprove();
		 String Work=hrbean.getWork();
		 int Rating=hrbean.getRating();
		 int Reasons=hrbean.getReasons();
		 
		 Connection con = null;
		 PreparedStatement ps = null;
		 try
		 {
		 con = DBConnection.createConnection();
		 String query="insert into Hr(Candidate_name,Hr_name,Role,Comm_skills,Group_work,Interperonalskills,Spontaneity,Dependability,Adaptability,Intiative,Learn,Improve,Work,Rating,Reasons) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		 ps.setString(1,Candidate_name);
		 ps.setString(2,Hr_name);
		 ps.setString(3,Role);
		 ps.setString(4,Comm_skills);
		 
		 
		 ps.setString(5,Group_work);
		 ps.setString(6,Interperonalskills);
		 
		 ps.setString(7,Spontaneity);
		 ps.setString(8,Dependability);
		 
		 ps.setString(9,Adaptability);
		 ps.setString(10,Intiative);
		 ps.setString(11,Learn);
		 ps.setString(12,Improve);
		 ps.setString(13,Work);
		 ps.setInt(14,Rating);
		 ps.setInt(15,Reasons);
		 
		
		 int i= ps.executeUpdate();
		 if(Rating>=3) { 
			 
			 
			 PreparedStatement  ps1=con.prepareStatement("update  Hr set status=? where Candidate_name=?");
				
			  ps1.setString(1,"Eligible"); 
			 
			  ps1.setString(2,Candidate_name); 
			 
			  int k=ps1.executeUpdate();
			 
			  System.out.println(k);
			  return "success";
			  
			  }
			  else {
				
				
				  PreparedStatement p=con.prepareStatement("update  Hr set status=? where candidate_name=?");
				  
				  p.setString(1,"notEligible");
				  p.setString(2,Candidate_name); 
				  int k=p.executeUpdate();
				  System.out.println(k);
				 
			System.out.println("not selected");
			 return "fail";
			
		  }
		 }
		 catch(Exception e)
		 {
		 System.out.println(e);
	}

	return "hi";
		 }

		
	 
	 }

