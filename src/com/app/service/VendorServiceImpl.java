package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AdminDao;
import com.app.dao.VendorDao;
import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;

@Service("vendorServices")
@Transactional
public class VendorServiceImpl implements VendorServices{

	@Autowired
	public VendorDao dao;
	
	@Override
	public BikeVendor loginVendor(String email, String password) {
		
		return dao.loginVendor(email, password);
	}

	@Override
	public BikeVendor getVendorbyEmailId(String email) {
		// TODO Auto-generated method stub
		return dao.getVendorbyEmailId(email);
	}

	@Override
	public String updateVendor(BikeVendor vendorDetails) {
		// TODO Auto-generated method stub
		return dao.updateVendorDetails(vendorDetails);
	}

	@Override
	public List<TypesOfService> fetchAllTypesServices() {
		// TODO Auto-generated method stub
		return dao.fetchAllTypesServices();
	}
}
