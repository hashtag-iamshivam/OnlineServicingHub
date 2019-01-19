package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;

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

	@Override
	public BikeVendor getVendorbyEmailId(String email) {
		
		String jpql = "select v from BikeVendor v where v.vendor_email = :email";
		
		return sf.getCurrentSession().createQuery(jpql,BikeVendor.class).
				setParameter("email",email).getSingleResult();
	}

	@Override
	public String updateVendorDetails(BikeVendor vendorDetails) {
		
		//System.out.println("HERE YOU ARE----->"+vendorDetails.getVendor_id());
		
		//BikeVendor temp_vendor=sf.getCurrentSession().get(BikeVendor.class, vendorDetails.getVendor_id());
		
		//System.out.println("HERE YOU ARE---------------------------------------------->"+temp_vendor);
		
		//sf.getCurrentSession().delete(temp_vendor);
		
		//sf.getCurrentSession().persist(vendorDetails);
		
		sf.getCurrentSession().update(vendorDetails);
		
		return "Updated Successfully";
	}

	@Override
	public List<TypesOfService> fetchAllTypesServices() {
		
		List<TypesOfService> services = new ArrayList<>();
		
		String jpql = "select s from TypesOfService s";
		
		services = sf.getCurrentSession().createQuery(jpql,TypesOfService.class).getResultList();
		
		
		return services;
	}

}
