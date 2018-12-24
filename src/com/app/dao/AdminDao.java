package com.app.dao;

import java.util.List;

import com.app.pojos.Admin;
import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;
import com.app.pojos.TypesOfVehicle;
import com.app.pojos.VehicleBrandName;
import com.app.pojos.VehicleModels;


public interface AdminDao
{

	public Admin getAdmin(String email,String pass);
	public String addServices(TypesOfService service_type);
	public List<TypesOfService> listAllServices();
	public TypesOfService getServiceById(Integer getServiceId);
	public String updateService(TypesOfService servicesToUpdate);
	public String deleteService(TypesOfService serviceToDelete);
	public String addtypeOfVehicle(TypesOfVehicle vehicleType);
	public List<TypesOfVehicle> listAlltypeOfVehicle();
	public TypesOfVehicle getTypeOfVehicleById(Integer typeOfVehicleId);
	public String updateTypeOfVehicle(TypesOfVehicle vehicleType);
	public String deleteTypeOfVehicle(TypesOfVehicle vehicleType);
	public String addBrandOfVehicle(Integer vehicleTypeId,VehicleBrandName vehicleBrand);
	public List<VehicleBrandName> listAllBrandByTypeOfVehicle(Integer vehicleTypeId);
	public String addModelOfVehicle(Integer brandType,Integer vehicleTypeId,VehicleModels vehicleModel);
	
	public String registerVendor(BikeVendor registerVendor);
	
	
}
