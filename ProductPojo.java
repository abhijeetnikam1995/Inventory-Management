package com.abhi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductPojo {
	
	@Column(name="product_id")
	private String product_id;
	
	@Column(name="Comp_Name")
	private String compname;
	
	@Id
	@Column(name="modelno")
	private String modelno;
	
	@Column(name="price")
	private float price;
	
	@Column(name="color")
	private String color;

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	public MobilePojo() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public MobilePojo(String modelno, String compname, String imeino, float price, String color) {
//		super();
//		this.modelno = modelno;
//		this.compname = compname;
//		this.imeino = imeino;
//		this.price = price;
//		this.color = color;
//	}

	
	

}
