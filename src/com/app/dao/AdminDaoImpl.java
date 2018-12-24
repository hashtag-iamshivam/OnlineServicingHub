package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Admin;
import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;
import com.app.pojos.TypesOfVehicle;
import com.app.pojos.VehicleBrandName;
import com.app.pojos.VehicleModels;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	public SessionFactory sf;

	@Override
	public Admin getAdmin(String email, String pass) {

		String jpql= "select a from Admin a where a.email = :email "
				+ "and a.password = :pass";

		return sf.getCurrentSession().createQuery(jpql,Admin.class).
				setParameter("email",email).setParameter("pass",pass).getSingleResult();
	}

	@Override
	public String addServices(TypesOfService service_type) {


		try{
			sf.getCurrentSession().persist(service_type);
			return "Successfully Added";
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}

	}

	@Override
	public List<TypesOfService> listAllServices() {

		String jpql = "select s from TypesOfService s";
		List<TypesOfService> serv =new ArrayList<>();
		serv=sf.getCurrentSession().createQuery(jpql, TypesOfService.class).getResultList();
		return serv;
	}

	@Override
	public TypesOfService getServiceById(Integer getServiceId) {

		return sf.getCurrentSession().get(TypesOfService.class, getServiceId);
	}

	@Override
	public String updateService(TypesOfService servicesToUpdate) {

		sf.getCurrentSession().update(servicesToUpdate);

		return "Services Updated";
	}

	@Override
	public String deleteService(TypesOfService serviceToDelete) {
		sf.getCurrentSession().delete(serviceToDelete);
		return "Delete SuccessFully";
	}

	@Override
	public String addtypeOfVehicle(TypesOfVehicle vehicleType) {

		try{
			sf.getCurrentSession().persist(vehicleType);
			return "Type of Vehicle Added Successfully";
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<TypesOfVehicle> listAlltypeOfVehicle() {
		// TODO Auto-generated method stub
		
		List<TypesOfVehicle> vehicle_type = new ArrayList<>();
		
		String jpql = "select v from TypesOfVehicle v";
		
		vehicle_type=sf.getCurrentSession().createQuery(jpql, TypesOfVehicle.class).getResultList();
		
		return vehicle_type;
	}

	@Override
	public TypesOfVehicle getTypeOfVehicleById(Integer typeOfVehicleId) {
		// TODO Auto-generated method stub
		return	sf.getCurrentSession().get(TypesOfVehicle.class, typeOfVehicleId);
	}

	@Override
	public String updateTypeOfVehicle(TypesOfVehicle vehicleType) {
		
		sf.getCurrentSession().update(vehicleType);
		
		return "Updated Successfully";
	}

	@Override
	public String deleteTypeOfVehicle(TypesOfVehicle vehicleType) {
		
		sf.getCurrentSession().delete(vehicleType);
		
		return "Deleted Successfully";
	}

	@Override
	public String addBrandOfVehicle(Integer vehicleTypeId, VehicleBrandName vehicleBrand) {
		// TODO Auto-generated method stub
		
		TypesOfVehicle vehicle_type = sf.getCurrentSession().get(TypesOfVehicle.class, vehicleTypeId);
		
		vehicle_type.addBrandOfVehicle(vehicleBrand);
		
		sf.getCurrentSession().persist(vehicleBrand);
		
		return "Added Successfully";
	}

	@Override
	public List<VehicleBrandName> listAllBrandByTypeOfVehicle(Integer vehicleTypeId) {
		
		List<VehicleBrandName> brands = new ArrayList<>();
		
		TypesOfVehicle vehicleType = sf.getCurrentSession().get(TypesOfVehicle.class, vehicleTypeId);
		
		brands = vehicleType.getBrand();
		
		return brands;
	}


	@Override
	public String addModelOfVehicle(Integer brandType,Integer vehicleTypeId, VehicleModels vehicleModel) {
		
		VehicleBrandName brand = sf.getCurrentSession().get(VehicleBrandName.class, brandType);
		
		System.out.println("VEHICLE BRAND NAME------------>"+brand);
		
		brand.addModelOfVehicle(vehicleModel);
		
		TypesOfVehicle vehicleType = sf.getCurrentSession().get(TypesOfVehicle.class, vehicleTypeId);
		
		System.out.println("-------------------------> Vehicle DETAILS--------->"+vehicleType);
		
		vehicleType.addModelOfVehicle(vehicleModel);
		
		sf.getCurrentSession().persist(vehicleModel);
		
		return "Inserted Successfullt";
	}

	@Override
	public String registerVendor(BikeVendor registerVendor) {
		
		sf.getCurrentSession().persist(registerVendor);
		
		return "Registered Successfully";
	}

	

	
	
}
