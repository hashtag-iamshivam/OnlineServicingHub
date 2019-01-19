package com.app.pojos;
import javax.persistence.*;


@Entity
@Table(name="vendor")
public class BikeVendor {

	private int vendor_id;
	private String vendor_name;
	private String vendor_email;
	private String vendor_password;
	private Integer vendor_contact;
	private String vendor_company_name;
	private Integer vendor_AadhaarCard;
	private Integer vendor_office_number;
	private Address vendor_address;
	private String vendor_company_type;
	private Integer status=0;

	//	
	//	CONSTRUCTORS
	//	

	public BikeVendor() {
		// TODO Auto-generated constructor stub
	}

	public BikeVendor(int vendor_id, String vendor_name, String vendor_email, String vendor_password,
			Integer vendor_contact, String vendor_company_name, Integer vendor_AadhaarCard, Integer vendor_office_number,
			Address vendor_address, String vendor_company_type, Integer status) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
		this.vendor_email = vendor_email;
		this.vendor_password = vendor_password;
		this.vendor_contact = vendor_contact;
		this.vendor_company_name = vendor_company_name;
		this.vendor_AadhaarCard = vendor_AadhaarCard;
		this.vendor_office_number = vendor_office_number;
		this.vendor_address = vendor_address;
		this.vendor_company_type = vendor_company_type;
		this.status = status;
	}


	public BikeVendor(String vendor_name, String vendor_email, String vendor_password, Integer vendor_contact,
			String vendor_company_name, Integer vendor_AadhaarCard, Integer vendor_office_number, 
			String vendor_company_type,
			String vendor_city,Integer status) {
		super();
		this.vendor_name = vendor_name;
		this.vendor_email = vendor_email;
		this.vendor_password = vendor_password;
		this.vendor_contact = vendor_contact;
		this.vendor_company_name = vendor_company_name;
		this.vendor_AadhaarCard = vendor_AadhaarCard;
		this.vendor_office_number = vendor_office_number;
		this.vendor_address.setVendor_city(vendor_city);
		this.vendor_company_type = vendor_company_type;
		this.status = status;
	}

	//	
	//	GETTERS AND SETTERS OF THE DATA MEMBERS
	//	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getVendor_id() {
		return vendor_id;
	}


	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	@Column(length=25)
	public String getVendor_name() {
		return vendor_name;
	}


	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	@Column(length=25, unique=true)
	public String getVendor_email() {
		return vendor_email;
	}


	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}

	@Column(length=25)
	public String getVendor_password() {
		return vendor_password;
	}


	public void setVendor_password(String vendor_password) {
		this.vendor_password = vendor_password;
	}

	@Column(length=25)
	public Integer getVendor_contact() {
		return vendor_contact;
	}


	public void setVendor_contact(Integer vendor_contact) {
		this.vendor_contact = vendor_contact;
	}

	@Column(length=25)
	public String getVendor_company_name() {
		return vendor_company_name;
	}


	public void setVendor_company_name(String vendor_company_name) {
		this.vendor_company_name = vendor_company_name;
	}

	@Column(length=25)
	public Integer getVendor_AadhaarCard() {
		return vendor_AadhaarCard;
	}


	public void setVendor_AadhaarCard(Integer vendor_AadhaarCard) {
		this.vendor_AadhaarCard = vendor_AadhaarCard;
	}

	@Column(length=25)
	public Integer getVendor_office_number() {
		return vendor_office_number;
	}


	public void setVendor_office_number(Integer vendor_office_number) {
		this.vendor_office_number = vendor_office_number;
	}

	@Embedded
	public Address getVendor_address() {
		return vendor_address;
	}


	public void setVendor_address(Address vendor_address) {
		this.vendor_address = vendor_address;
	}

	@Column(length=25)
	public String getVendor_company_type() {
		return vendor_company_type;
	}

	
	public void setVendor_company_type(String vendor_company_type) {
		this.vendor_company_type = vendor_company_type;
	}

	@Column(length=25)
	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	/*TO STRING METHODS*/


	@Override
	public String toString() {
		return "BikeVendor [vendor_id=" + vendor_id + ", vendor_name=" + vendor_name + ", vendor_email=" + vendor_email
				+ ", vendor_password=" + vendor_password + ", vendor_contact=" + vendor_contact
				+ ", vendor_company_name=" + vendor_company_name + ", vendor_AadhaarCard=" + vendor_AadhaarCard
				+ ", vendor_office_number=" + vendor_office_number + ", vendor_address=" + vendor_address
				+ ", vendor_company_type=" + vendor_company_type + ", status=" + status + "]";
	}




}
