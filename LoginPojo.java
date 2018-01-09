package com.abhi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginPojo {

	@Id
	@Column(name="uname")
	private String uname;
	
	@Column(name="pwd")
	private String pwd;

//	public LoginPojo() {
//		super();
//	}
//
//	public LoginPojo(String uname, String pwd) {
//		super();
//		this.uname = uname;
//		this.pwd = pwd;
//	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
