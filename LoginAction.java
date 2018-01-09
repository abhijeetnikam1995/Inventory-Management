package com.abhi;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;

public class LoginAction implements ModelDriven<LoginPojo>
{

	LoginPojo lpojo=new LoginPojo();
	LoginDAO dao=new LoginDAO();
	
	public LoginPojo getLpojo() {
		return lpojo;
	}


	public void setLpojo(LoginPojo lpojo) {
		this.lpojo = lpojo;
	}


	@Override
	public LoginPojo getModel() {
		// TODO Auto-generated method stub
		return lpojo;
	}
	//LoginPojo lpogo=new LoginPojo();	
	public String execute()
	{
		String s=dao.check(lpojo);
		return s;
	}
	
	
	
	
}
