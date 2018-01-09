package com.abhi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regi")
public class RegiPojo {

	@Id
	@GeneratedValue
	@Column(name="rid")
	private int rid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="country")
	private String country;
	
	@Column(name="rdate")
	private String rdate;

//	public RegiPojo() {
//		super();
//	}
//
//	public RegiPojo(String name, String email, String pwd, String gender, String country, String rdate) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.pwd = pwd;
//		this.gender = gender;
//		this.country = country;
//		this.rdate = rdate;
//	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	
	
}
