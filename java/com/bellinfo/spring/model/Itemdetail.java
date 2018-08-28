package com.bellinfo.spring.model;

public class Itemdetail {
	
	String dercreption;
	float price;
	String href;
	public String getDercreption() {
		return dercreption;
	}
	public void setDercreption(String dercreption) {
		this.dercreption = dercreption;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	@Override
	public String toString() {
		return "Itemdetail [dercreption=" + dercreption + ", price=" + price + ", href=" + href + "]";
	}
	public Itemdetail() {
		
	}
	
	

}
