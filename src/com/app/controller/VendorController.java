package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Address;
import com.app.pojos.BikeVendor;
import com.app.pojos.TypesOfService;
import com.app.service.VendorServices;

@Controller
@RequestMapping("/vendor")
public class VendorController {
	
	@Autowired
	@Qualifier("vendorServices")
	public VendorServices service;
	
	public VendorController() {
		// TODO Auto-generated constructor stub
		
		System.out.println("In Vendor Constructors");
		
	}
	
	@GetMapping("/login")
	public String showVendorLoginForm(){
		System.out.println("----------You are in Vendor LOGIN FORM----------");		
		
		return "/vendor/login";
	}
	
	@PostMapping("/login")
	public String processVendorLoginForm(@RequestParam String vendor_email,@RequestParam String vendor_password, Model map){
		
		System.out.println("you are in Process Login vendor Form-->>>");
		BikeVendor vendorLoginDetails=service.loginVendor(vendor_email, vendor_password);
		
		map.addAttribute("vendorEmail", vendor_email);
		
		if(vendorLoginDetails!=null)
		{
			Integer status = vendorLoginDetails.getStatus();
			
			if(status == 0)
			{
				return "redirect:/vendor/updatevendor";
			}else{
				return "redirect:/vendor/homepage";
			}
		}
		
		return "/vendor/login";
	}
	
	@GetMapping("/updatevendor")
	public String showVendorupdateForm(Model map,@RequestParam String vendorEmail)
	{
		System.out.println("VENDOR EMAIL ID IS---------->"+vendorEmail);
		
		map.addAttribute("updatevendor", service.getVendorbyEmailId(vendorEmail));
		System.out.println("You are in vendor Update Form");
		return "/vendor/updatevendor";
	}
	
	@GetMapping("/homepage")
	public String showVendorHomePage()
	{
		System.out.println("You are in vendor HomePage");
		return "/vendor/homepage";
	}
	
	
	@PostMapping("/updatevendor")
	public String processVendorUpdateForm(BikeVendor vendorDetails,
			@RequestParam String vendor_city, 
			@RequestParam String vendor_state,
			@RequestParam String vendor_street, 
			@RequestParam String vendor_pincode)
	{
		
		Address vendorAddress = new Address(Integer.parseInt(vendor_pincode), 
				vendor_city, vendor_street, vendor_state);
		
		vendorDetails.setVendor_address(vendorAddress);		
		vendorDetails.setStatus(1);
		System.out.println("Vendor Details--->"+vendorDetails);
		
		service.updateVendor(vendorDetails);
		
		return "redirect:/vendor/homepage";
	}
	
	@GetMapping("/services")
	public String showServicesForm(HttpSession hs,RedirectAttributes flashmap,Model map){
		
		
		TypesOfService typeService = new TypesOfService();
		map.addAttribute("typeservices", typeService);
		flashmap.addAttribute("typeservices", typeService);		
		System.out.println("You are in Show Services Form");	
		hs.setAttribute("servicesdetails",service.fetchAllTypesServices());
		return "/vendor/addservice";
	}
	
	
	@PostMapping("/services")
	public String processServiceFormCustomers(TypesOfService typesOfService)
	{
		System.out.println("You are here----------->"+typesOfService);
		
		return "";
	}

}
