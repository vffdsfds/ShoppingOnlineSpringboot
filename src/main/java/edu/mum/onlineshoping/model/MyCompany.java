package edu.mum.onlineshoping.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class MyCompany {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long orderId;
	
	private String pname;
	
	private double returnPrice ;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getReturnPrice() {
		return returnPrice;
	}

	public void setReturnPrice(double returnPrice) {
		this.returnPrice = returnPrice;
	}

	
	
}
