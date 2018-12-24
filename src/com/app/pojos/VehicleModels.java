package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="vehicle_model")
public class VehicleModels {
	
	private Integer vehicleModelId;
	private String vehicleModelName;
	
	private VehicleBrandName vehicleBrandName;
	private TypesOfVehicle vehicletype;
	
	
	/*
	 * 
	 * CONSTRUCTORS
	 * 
	*/
	
	public VehicleModels() {
		// TODO Auto-generated constructor stub
	}

	public VehicleModels(Integer vehicleModelId, String vehicleModelName) {
		super();
		this.vehicleModelId = vehicleModelId;
		this.vehicleModelName = vehicleModelName;
	}

	public VehicleModels(String vehicleModelName) {
		super();
		this.vehicleModelName = vehicleModelName;
	}
	
	

	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	*/
	
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getVehicleModelId() {
		return vehicleModelId;
	}

	public void setVehicleModelId(Integer vehicleModelId) {
		this.vehicleModelId = vehicleModelId;
	}

	@Column(length=20,nullable=false)
	public String getVehicleModelName() {
		return vehicleModelName;
	}

	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName;
	}
	
	@ManyToOne // mandatory --o.w throws org.hib.MappingExc
	@JoinColumn(name = "brandtype")
	public VehicleBrandName getVehicleBrandName() {
		return vehicleBrandName;
	}

	public void setVehicleBrandName(VehicleBrandName vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}
	
	
	@ManyToOne // mandatory --o.w throws org.hib.MappingExc
	@JoinColumn(name = "vehicletype")
	public TypesOfVehicle getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(TypesOfVehicle vehicletype) {
		this.vehicletype = vehicletype;
	}
	
	
	/*
	 * 
	 * TO STRING METHODS
	 * 
	*/	

	@Override
	public String toString() {
		return "VehicleModels [vehicleModelId=" + vehicleModelId + ", vehicleModelName=" + vehicleModelName + "]";
	}
	
	

}
