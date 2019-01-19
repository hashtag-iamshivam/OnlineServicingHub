package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="vendorservices")
public class VendorServices {
	
	private Integer serviceId;
	private Integer serviceRate;
	
	/*
		Constructors
	 */	
	
	public VendorServices() {
		super();
	}

	public VendorServices(Integer serviceId, TypesOfService typeService, Integer serviceRate) {
		super();
		this.serviceId = serviceId;
		this.serviceRate = serviceRate;
	}

	public VendorServices(TypesOfService typeService, Integer serviceRate) {
		super();
		this.serviceRate = serviceRate;
	}
	
		/*
		 * GETTERS AND SETTERS
		 * 
		*/	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	
	
	@Column(length=10)
	public Integer getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(Integer serviceRate) {
		this.serviceRate = serviceRate;
	}

	

}
