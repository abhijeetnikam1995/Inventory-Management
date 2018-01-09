package com.abhi;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;

public class RegiAction implements ModelDriven<RegiPojo>{
	
		RegiDAO dao=new RegiDAO();
		RegiPojo rpojo=new RegiPojo();
		
		
	public RegiPojo getRpojo() {
			return rpojo;
		}
		public void setRpojo(RegiPojo rpojo) {
			this.rpojo = rpojo;
		}
	public String execute() throws ClassNotFoundException, SQLException
	{
		String s=dao.insert(rpojo);
		return s;
	}
	@Override
	public RegiPojo getModel() {
		// TODO Auto-generated method stub
		return rpojo;
	}

}
