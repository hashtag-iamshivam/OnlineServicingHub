package com.app.pojos;
import javax.persistence.*;

@Embeddable
public class Address {
	
	private Integer pincode;
	private String vendor_city;
	private String vendor_street;
	private String vendor_state;
	
	/*ADDRESS CONSTRUCTORS*/
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Integer pincode, String vendor_city, String vendor_street, String vendor_state) {
		super();
		this.pincode = pincode;
		this.vendor_city = vendor_city;
		this.vendor_street = vendor_street;
		this.vendor_state = vendor_state;
	}
	
	/*Getters AND SETTERS OF THE DATA MEMEBERS*/
	
	@Column(length=25)
	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Column(length=25)
	public String getVendor_city() {
		return vendor_city;
	}

	public void setVendor_city(String vendor_city) {
		this.vendor_city = vendor_city;
	}
	@Column(length=25)
	public String getVendor_street() {
		return vendor_street;
	}

	public void setVendor_street(String vendor_street) {
		this.vendor_street = vendor_street;
	}
	@Column(length=25)
	public String getVendor_state() {
		return vendor_state;
	}

	public void setVendor_state(String vendor_state) {
		this.vendor_state = vendor_state;
	}
	
	
	/*TO STRING METHODS*/
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", vendor_city=" + vendor_city + ", vendor_street=" + vendor_street
				+ ", vendor_state=" + vendor_state + "]";
	}

}
