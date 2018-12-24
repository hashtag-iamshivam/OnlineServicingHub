package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AdminDao;
import com.app.dao.VendorDao;
import com.app.pojos.BikeVendor;

@Service("vendorServices")
@Transactional
public class VendorServiceImpl implements VendorServices{

	@Autowired
	public VendorDao dao;
	
	@Override
	public BikeVendor loginVendor(String email, String password) {
		
		return dao.loginVendor(email, password);
	}
}
