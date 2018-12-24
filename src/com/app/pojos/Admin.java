package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
	
//	Private Fields to be USED
	
	private Integer adminId;
	private String name;
	private String email;
	private String password;
	private String designation;
	private Integer contact;
	private String location;
	private String branch;
	
//	CONSTRUCTORS
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}


	public Admin(Integer adminId, String name, String email, String password, String designation, Integer contact) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.contact = contact;
	}


	

	public Admin(String name, String email, String password, String designation, Integer contact, String location,
			String branch) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.contact = contact;
		this.location = location;
		this.branch = branch;
	}


	/*GETTERS AND SETTERS*/

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getAdminId() {
		return adminId;
	}


	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	@Column(length=25,nullable=false)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(length=25,nullable=false,unique=true)
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=25,nullable=false)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length=25,nullable=false)
	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(length=25,nullable=false)
	public Integer getContact() {
		return contact;
	}


	public void setContact(Integer contact) {
		this.contact = contact;
	}
	
	

	@Column(length=25,nullable=false)
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	@Column(length=25,nullable=false)
	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}

	/*TOSTRINGS METHODS*/

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", designation=" + designation + ", contact=" + contact + "]";
	}	
}
