package com.abhi;

import com.opensymphony.xwork2.ModelDriven;

public class ProductAction implements ModelDriven<ProductPojo>{

	ProductPojo pojo=new ProductPojo();
	
	ProductDAO dao=new ProductDAO();
	




	public ProductPojo getPojo() {
		return pojo;
	}

	public void setPojo(ProductPojo pojo) {
		this.pojo = pojo;
	}

	@Override
	public ProductPojo getModel() {
		// TODO Auto-generated method stub
		return pojo;
	}
	
	public String execute()
	{
		return dao.insert(pojo);
	}

}
