package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="vehicle_brand")
public class VehicleBrandName {
	
	private Integer brandId;
	private String brandName;
	private TypesOfVehicle vehicleType;
	
	private List<VehicleModels> vehicleModels = new ArrayList<>();
	 
	/*
	 * Constructor
	*/
	
	
	public VehicleBrandName() {
		// TODO Auto-generated constructor stub
	}

	public VehicleBrandName(Integer brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public VehicleBrandName(String brandName) {
		super();
		this.brandName = brandName;
	}
	
	/*
	 * Getters and Setters
	*/

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(length=20,nullable=false)
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@ManyToOne // mandatory --o.w throws org.hib.MappingExc
	@JoinColumn(name = "vehicletype")
	public TypesOfVehicle getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(TypesOfVehicle vehicleType) {
		this.vehicleType = vehicleType;
	}	
	
	@OneToMany(mappedBy="vehicleBrandName",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<VehicleModels> getVehicleModels() {
		return vehicleModels;
	}

	public void setVehicleModels(List<VehicleModels> vehicleModels) {
		this.vehicleModels = vehicleModels;
	}

	
	
	/*
	 * To Strings Methods
	*/

	
	@Override
	public String toString() {
		return "VehicleBrandName [brandId=" + brandId + ", brandName=" + brandName + "]";
	}	
	
	
	
	
	/*
	 * Convience Methods
	*/
	
	public void addModelOfVehicle(VehicleModels modelVehicle){
		vehicleModels.add(modelVehicle);
		modelVehicle.setVehicleBrandName(this);
		
	}
	
	public void removeBrandOfvehicle(VehicleModels modelVehicle)
	{
		vehicleModels.remove(modelVehicle);
		modelVehicle.setVehicleBrandName(null);
	}
	
	
	
}
