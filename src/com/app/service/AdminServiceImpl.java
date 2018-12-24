package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AdminDao;
import com.app.pojos.Admin;
import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;
import com.app.pojos.TypesOfVehicle;
import com.app.pojos.VehicleBrandName;
import com.app.pojos.VehicleModels;

@Service("x")
@Transactional
public class AdminServiceImpl implements AdminService
{
	@Autowired
	public AdminDao dao;
	
	@Override
	public Admin getAdmin(String email, String pass) {
		
		return dao.getAdmin(email, pass);
	}
	@Override
	public String addServices(TypesOfService service_type) {
		
		return dao.addServices(service_type);
	}
	@Override
	public List<TypesOfService> listAllServices() {
		
		return dao.listAllServices();
	}
	@Override
	public TypesOfService getServiceById(Integer getServiceId) {
		
		
		
		return dao.getServiceById(getServiceId);
	}
	@Override
	public String updateService(TypesOfService servicesToUpdate) {
		
		return dao.updateService(servicesToUpdate);
	}
	@Override
	public String deleteService(TypesOfService serviceToDelete) {
		
		return dao.deleteService(serviceToDelete);
	}
	@Override
	public String addtypeOfVehicle(TypesOfVehicle vehicleType) {
		
		return dao.addtypeOfVehicle(vehicleType);
	}
	@Override
	public List<TypesOfVehicle> listAlltypeOfVehicle() {
		
		return dao.listAlltypeOfVehicle();
	}
	@Override
	public TypesOfVehicle getTypeOfVehicleById(Integer typeOfVehicleId) {
		// TODO Auto-generated method stub
		return dao.getTypeOfVehicleById(typeOfVehicleId);
	}
	@Override
	public String updateTypeOfVehicle(TypesOfVehicle vehicleType) {
		// TODO Auto-generated method stub
		return dao.updateTypeOfVehicle(vehicleType);
	}
	@Override
	public String deleteTypeOfVehicle(TypesOfVehicle vehicleType) {
		
		return dao.deleteTypeOfVehicle(vehicleType);
	}
	@Override
	public String addBrandOfVehicle(Integer vehicleTypeId, VehicleBrandName vehicleBrand) {
		// TODO Auto-generated method stub
		return dao.addBrandOfVehicle(vehicleTypeId, vehicleBrand); 
	}
	@Override
	public List<VehicleBrandName> listAllBrandByTypeOfVehicle(Integer vehicleTypeId) {
		// TODO Auto-generated method stub
		return dao.listAllBrandByTypeOfVehicle(vehicleTypeId);
	}
	@Override
	public String addModelOfVehicle(Integer brandType,Integer vehicleTypeId, VehicleModels vehicleModel) {
		// TODO Auto-generated method stub
		return dao.addModelOfVehicle(brandType, vehicleTypeId, vehicleModel);
	}
	@Override
	public String registerVendor(BikeVendor registerVendor) {
		
		return dao.registerVendor(registerVendor);
	}
	
	
	
}
