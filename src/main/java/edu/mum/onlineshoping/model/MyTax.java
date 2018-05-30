package edu.mum.onlineshoping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class MyTax {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long orderId;
	
	private double tax;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	} 
	
	
}
