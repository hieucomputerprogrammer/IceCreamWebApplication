package com.nashtechglobal.IceCreamWebApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.Admin;
import com.nashtechglobal.IceCreamWebApplication.repository.AdminRepository;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {
	@Autowired
	private AdminRepository adminRepository;

	@PostMapping(path = "/createAdmin")
	public @ResponseBody String addNewAdmin(@RequestParam String username, @RequestParam String password) {
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		adminRepository.save(admin);
		return "New admin created.";
	}

	@GetMapping
	public @ResponseBody Iterable<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}
}