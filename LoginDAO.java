package com.abhi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class LoginDAO {
	
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;
	public String check(LoginPojo lpojo) 
	{
		String uname=lpojo.getUname();//checking data of front-end with tables row
		String pwd=lpojo.getPwd();
		
						String hql1="from ProductPojo";
						Query query1=session.createQuery(hql1);
		
						List<ProductPojo> mlist=query1.list();
						
						HttpServletRequest request=ServletActionContext.getRequest();
						
						HttpSession hs=request.getSession(true);
						
						
						hs.setAttribute("mlist",mlist);
		
		String hql="from LoginPojo where uname=:v1 and pwd=:v2";
		Query query=session.createQuery(hql);
		
		query.setParameter("v1",uname);
		query.setParameter("v2",pwd);
		
		List<LoginPojo> list=query.list();
		
		if(list.isEmpty())
			return "error"; 
		else
			return "success";
		
	}

}
