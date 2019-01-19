package com.app.dao;

import java.util.List;

import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;

public interface VendorDao {
	public BikeVendor loginVendor(String email,String pass);
	public BikeVendor getVendorbyEmailId(String email);
	public String updateVendorDetails(BikeVendor vendorDetails);
	public List<TypesOfService> fetchAllTypesServices();

}
