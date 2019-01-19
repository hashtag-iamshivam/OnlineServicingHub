package com.app.service;

import java.util.List;

import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;

public interface VendorServices {

	public BikeVendor loginVendor(String email, String password);
	public BikeVendor getVendorbyEmailId(String email);
	public String updateVendor(BikeVendor vendorDetails);
	public List<TypesOfService> fetchAllTypesServices();
	
}
