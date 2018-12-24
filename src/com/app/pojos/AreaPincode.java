package com.app.pojos;

import javax.persistence.*;


@Entity
@Table(name="pincode")
public class AreaPincode {
	
	private Integer pinId;
	private Integer pinCode;
	private String area;
	
	/*
	 * CONSTRUCTORS
	*/
	
	public AreaPincode() {
		// TODO Auto-generated constructor stub
	}


	public AreaPincode(Integer pinId, Integer pinCode, String area) {
		super();
		this.pinId = pinId;
		this.pinCode = pinCode;
		this.area = area;
	}


	public AreaPincode(Integer pinCode, String area) {
		super();
		this.pinCode = pinCode;
		this.area = area;
	}

	/*
	 * Getter and Setters
	*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPinId() {
		return pinId;
	}


	public void setPinId(Integer pinId) {
		this.pinId = pinId;
	}

	@Column(length=25,nullable=false)
	public Integer getPinCode() {
		return pinCode;
	}


	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Column(length=25,nullable=false)
	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	/*
	 * To String Methods
	*/
	
	@Override
	public String toString() {
		return "AreaPincode [pinId=" + pinId + ", pinCode=" + pinCode + ", area=" + area + "]";
	}	

}
