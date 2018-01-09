package com.abhi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.mysql.jdbc.Driver;

public class RegiDAO {
	
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;
	public String insert(RegiPojo rpojo) throws ClassNotFoundException, SQLException
	{
		
//		Calendar c=Calendar.getInstance();
//		Object date=c.get(Calendar.DATE);
//		Object month=c.get(Calendar.MONTH);
//		Object year=c.get(Calendar.YEAR);
//		String rdate=date+"/"+month+"/"+year;
//		rpojo.setRdate(rdate);
		session.save(rpojo);
		
		
		
		LoginPojo lpojo=new LoginPojo();
		lpojo.setUname(rpojo.getEmail());//regi table ka email/password login table ke columns me set kiya
		lpojo.setPwd(rpojo.getPwd());
		session.save(lpojo);
		return "success";
		
	}

}
