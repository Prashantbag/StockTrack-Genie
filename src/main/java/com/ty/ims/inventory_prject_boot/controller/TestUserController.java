package com.ty.ims.inventory_prject_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestUserController {

	
	@GetMapping("/userss")
	public String getUser() {
		return "THis is user";
	}
}
