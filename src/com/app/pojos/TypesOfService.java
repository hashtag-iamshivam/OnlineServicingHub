package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="services_type")
public class TypesOfService {

	private Integer serviceId;
	private String serviceName;

	/*	
	//	CONSTRUCTORS
	 */	
	public TypesOfService() {
		// TODO Auto-generated constructor stub
	}


	public TypesOfService(Integer serviceId, String serviceName) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
	}


	public TypesOfService(String serviceName) {
		super();
		this.serviceName = serviceName;
	}

	/*//	
	//	GETTERS AND SETTERS
	//	
	*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getServiceId() {
		return serviceId;
	}


	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	@Column(length=20,nullable=false)
	public String getServiceName() {
		return serviceName;
	}


	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	
	/*TO STRING METHODS*/

	@Override
	public String toString() {
		return "TypesOfService [serviceId=" + serviceId + ", serviceName=" + serviceName + "]";
	}



}
