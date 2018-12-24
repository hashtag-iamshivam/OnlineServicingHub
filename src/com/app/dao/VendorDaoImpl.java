package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.BikeVendor;

@Repository
public class VendorDaoImpl implements VendorDao {

	@Autowired
	public SessionFactory sf;
	
	@Override
	public BikeVendor loginVendor(String email, String pass) {
	
		String jpql= "select v from BikeVendor v where v.vendor_email = :email "
				+ "and v.vendor_password = :pass";

		return sf.getCurrentSession().createQuery(jpql,BikeVendor.class).
				setParameter("email",email).setParameter("pass",pass).getSingleResult();
		
	}

}
