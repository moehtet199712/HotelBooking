package com.hotel.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hotel.booking.service.HotelBookingService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HotelBookingController {

//	@GetMapping("/")
//	public String index() {
//		return "screen/index";
//	}
	@Autowired
	HotelBookingService hotelBookingService;
	
	@GetMapping("/")
	public String index(Model model,HttpSession session) {
		model.addAttribute("rooms",this.hotelBookingService.getRoom());
		model.addAttribute("Auth",this.hotelBookingService.checkAuth(session));
		return "screen/index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "screen/login";
	}
}
