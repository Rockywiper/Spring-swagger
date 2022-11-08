package com.amazonOrder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long oId;
	private String productname;
	private Long productprice;
	private String productweight;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(Long oId, String productname, Long productprice, String productweight) {
		super();
		this.oId = oId;
		this.productname = productname;
		this.productprice = productprice;
		this.productweight = productweight;
	}
	public Long getoId() {
		return oId;
	}
	public void setoId(Long oId) {
		this.oId = oId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Long getProductprice() {
		return productprice;
	}
	public void setProductprice(Long productprice) {
		this.productprice = productprice;
	}
	public String getProductweight() {
		return productweight;
	}
	public void setProductweight(String productweight) {
		this.productweight = productweight;
	}
	
}
