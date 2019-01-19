package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Admin;
import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;
import com.app.pojos.TypesOfVehicle;
import com.app.pojos.VehicleBrandName;
import com.app.pojos.VehicleModels;
import com.app.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	@Qualifier("x")
	public AdminService service;
	
	@GetMapping("/login")
	public String showAdminLoginForm(){
			
		return "/admin/login";
	}
	
	@PostMapping("/login")
	public String processAdminLoginForm(@RequestParam String email, @RequestParam String pass){
		
		Admin admin = service.getAdmin(email, pass);
		
		return "redirect:/admin/services";
	}
	
	@GetMapping("/services")
	public String showAdminServicesForm(){
		
		return "/admin/services";
	}
	
	@GetMapping("/addservices")
	public String showAddServiceForm(){
		
		return "/admin/addservices";
		
	}
	
	@PostMapping("/addservices")
	public String processServiceForm(@RequestParam String servicetype){
		
		
		TypesOfService serv = new TypesOfService(servicetype);
		service.addServices(serv);
		return "redirect:/admin/addservices";
	}
	
	@GetMapping("/listservices")
	public String listAllServices(HttpSession hs){
		
		hs.setAttribute("Services_details", service.listAllServices());		
		return "/admin/listservices";
	}
	
	@GetMapping("/updateservice")
	public String showUpdateServiceForm(@RequestParam Integer serviceId, Model map){
	
		map.addAttribute("getservicetype", service.getServiceById(serviceId));
		return "/admin/updateservice";
	}
	
	@PostMapping("/updateservice")
	public String processUpdateServiceForm(@ModelAttribute("typesOfService")TypesOfService serviceToUpdate,Model map)
	{
		service.updateService(serviceToUpdate);
		return "redirect:/admin/listservices";
	}
	
	@GetMapping("/deleteservice")
	public String showDeleteServiceForm(@RequestParam Integer serviceId, Model map){
		TypesOfService serv = service.getServiceById(serviceId);
		service.deleteService(serv);
		return "redirect:/admin/listservices";
	}
		
	@GetMapping("/addtypeofvehicle")
	public String showAddTypeOfVehicleForm(){
		return "/admin/addvehicletype";	
	}
	
	@PostMapping("/addtypeofvehicle")
	public String processAddTypeOfVehicleForm(@RequestParam String vehicletype){
		
		TypesOfVehicle veh_type = new TypesOfVehicle(vehicletype);
		service.addtypeOfVehicle(veh_type);
		return "redirect:/admin/addtypeofvehicle";
	}
	
	
	@GetMapping("/listtypeofvehicle")
	public String listTypeOfVehicle(HttpSession hs){
		
		hs.setAttribute("ListTypeOfVehicle", service.listAlltypeOfVehicle());	
		return "/admin/listvehicle";
	}
	
	@GetMapping("/updatetypeofvehicle")
	public String showUpdateTypeOfVehicleForm(@RequestParam Integer vehicleTypeId, Model map){
		
		map.addAttribute("gettypeofvehicle", service.getTypeOfVehicleById(vehicleTypeId));
		
		return "/admin/updatetypeofvehicle";
	}
	
	@PostMapping("/updatetypeofvehicle")
	public String processUpdateTypeOfVehicleForm(TypesOfVehicle vehicleType,Model map)
	{
		service.updateTypeOfVehicle(vehicleType);
		return "redirect:/admin/listtypeofvehicle";
	}
	
	@GetMapping("/deletetypeofvehicle")
	public String processDeleteTypesOfVehicle(@RequestParam Integer vehicleTypeId, Model map)
	{
		TypesOfVehicle vehicle_type = service.getTypeOfVehicleById(vehicleTypeId);
		service.deleteTypeOfVehicle(vehicle_type);
		return "redirect:/admin/listtypeofvehicle";
	}
	
	@GetMapping("/addbrandofvehicle")
	public String showAddBrandOfVehicleForm(@RequestParam Integer vehicleTypeId,RedirectAttributes flashMap){
		
		flashMap.addAttribute("vehicleId",vehicleTypeId);
		return "/admin/addbrandofvehicle";
	}
	
	@PostMapping("/addbrandofvehicle")
	public String processAddBrandOfVehicle(@RequestParam Integer vehicleType, @RequestParam String brandName,Model map){
		
		VehicleBrandName brandNames = new VehicleBrandName(brandName);
		service.addBrandOfVehicle(vehicleType, brandNames);
		return "redirect:/admin/listtypeofvehicle";
	}
	
	@GetMapping("/listbrandofvehicle")
	public String showListAllBrandOfVehicleById(@RequestParam Integer vehicleTypeId,HttpSession hs,RedirectAttributes flashMap)
	{
		flashMap.addAttribute("vehicleId",vehicleTypeId);
		hs.setAttribute("list_brands", service.listAllBrandByTypeOfVehicle(vehicleTypeId));	
		return "/admin/listallbrand";
	}
	
	@GetMapping("/addmodelofbrand")
	public String showAddModelOfBrand(@RequestParam Integer brandId,@RequestParam Integer vehicleTypeId,RedirectAttributes flashMap)
	{
		flashMap.addAttribute("vehicleTypeId",vehicleTypeId);
		flashMap.addAttribute("brandId",brandId);
		return "/admin/addmodelofbrand";
	}
	
	@PostMapping("/addmodelofbrand")
	public String processAddModelOfBrand(@RequestParam Integer brandType,@RequestParam Integer vehicleTypeId, @RequestParam String vehicleModelName)
	{
		VehicleModels models = new VehicleModels(vehicleModelName);
		service.addModelOfVehicle(brandType,vehicleTypeId, models);
		return "/admin/addmodelofbrand";
	}
	
	@GetMapping("/addvendor")
	public String showAddVendorForm(Model map){
		BikeVendor bikeVendor = new BikeVendor();
		
		bikeVendor.setStatus(0);
		map.addAttribute("Vendor", bikeVendor);
		System.out.println("In show ADD VENDOR FORM");
		return "/admin/vendor/addvendor";
	}
	
	@PostMapping("/addvendor")
	public String processAddVendorForm(BikeVendor addvendor,Model map)
	{
		
		System.out.println("VENDOR DETAILS--------->"+addvendor);
		service.registerVendor(addvendor);
		return "";
	}
}
