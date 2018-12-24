package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.BikeVendor;
import com.app.service.AdminService;
import com.app.service.VendorServices;

@Controller
@RequestMapping("/vendor")
public class VendorController {
	
	@Autowired
	@Qualifier("vendorServices")
	public VendorServices service;
	
	@GetMapping("/login")
	public String showVendorLoginForm(){
		System.out.println("----------You are in Vendor LOGIN FORM----------");		
		
		return "/vendor/login";
	}
	
	@PostMapping("/login")
	public String processVendorLoginForm(@RequestParam String vendor_email,@RequestParam String vendor_password){
		
		System.out.println("you are in Process Login vendor Form-->>>");
		BikeVendor vendorLoginDetails=service.loginVendor(vendor_email, vendor_password);
		
		if(vendorLoginDetails!=null)
		{
			Integer status = vendorLoginDetails.getStatus();
			
			if(status == 0)
			{
				return "/vendor/updatevendor";
			}else{
				return "/vendor/homepage";
			}
		}
		
		return "/vendor/login";
	}

}
