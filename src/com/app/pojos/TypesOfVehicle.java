package com.app.pojos;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="vehicle_type")
public class TypesOfVehicle {
	
	private Integer vehicleTypeId;
	private String vehicleTypeName;
	
	private List<VehicleBrandName> brand = new ArrayList<>();
	//private List<VehicleModels>  modelList = new ArrayList<>();
	private Set<VehicleModels> modelList = new HashSet<>();
	
	
	/*
	 * Constructors
	*/
	
	public TypesOfVehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public TypesOfVehicle(Integer vehicleTypeId, String vehicleTypeName) {
		super();
		this.vehicleTypeId = vehicleTypeId;
		this.vehicleTypeName = vehicleTypeName;
	}

	public TypesOfVehicle(String vehicleTypeName) {
		super();
		this.vehicleTypeName = vehicleTypeName;
	}
	
	/*
	 * Getters AND SETTERS
	*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(Integer vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	@Column(length=20,nullable=false)
	public String getVehicleTypeName() {
		return vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}
	
	@OneToMany(mappedBy="vehicleType",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<VehicleBrandName> getBrand() {
		return brand;
	}

	public void setBrand(List<VehicleBrandName> brand) {
		this.brand = brand;
	}
	
	
	

	@OneToMany(mappedBy="vehicletype",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public Set<VehicleModels> getModelList() {
		return modelList;
	}

	public void setModelList(Set<VehicleModels> modelList) {
		this.modelList = modelList;
	}
		
	/*
	 * Convience Methods FOR BRAND OF BIKES
	*/
		

	public void addBrandOfVehicle(VehicleBrandName brandOfVehicle){
		brand.add(brandOfVehicle);
		brandOfVehicle.setVehicleType(this);
	}
	
	public void removeBrandOfvehicle(VehicleBrandName brandOfVehicle)
	{
		brand.remove(brandOfVehicle);
		brandOfVehicle.setVehicleType(null);
	}	
	
	
	/*
	 * Convience Methods FOR MODEL OF BIKES
	*/
		
	
	
	public void addModelOfVehicle(VehicleModels vehicleModel){
		modelList.add(vehicleModel);
		vehicleModel.setVehicletype(this);
	}
	
	public void removeModelOfvehicle(VehicleModels vehicleModel)
	{
		brand.remove(vehicleModel);
		vehicleModel.setVehicletype(null);
	}	
	
	
	/*
	 * To Strings
	*/

	@Override
	public String toString() {
		return "TypesOfVehicle [vehicleTypeId=" + vehicleTypeId + ", vehicleTypeName=" + vehicleTypeName + "]";
	}	

}
