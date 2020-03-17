package com.nashtechglobal.IceCreamWebApplication.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.Customer;
import com.nashtechglobal.IceCreamWebApplication.repository.CustomerRepository;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping(path = "/createCustomer")
	public @ResponseBody String createNewCustomer(@RequestParam String username, @RequestParam String password,
			@RequestParam String fullname, @RequestParam String address, @RequestParam String phone_number,
			@RequestParam String email, @RequestParam Integer gender,
			@RequestParam @DateTimeFormat(pattern = "MMddyyyy") Date birthday, @RequestParam String avatar,
			@RequestParam @DateTimeFormat(pattern = "MMddyyyy") Date expired_date,
			@RequestParam Integer enable_status) {
		Customer customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		customer.setFullname(fullname);
		customer.setAddress(address);
		customer.setPhone_number(phone_number);
		customer.setEmail(email);
		customer.setGender(gender);
		customer.setBirthday(birthday);
		customer.setAvatar(avatar);
		customer.setExpired_date(expired_date);
		customer.setEnable_status(enable_status);
		customerRepository.save(customer);
		return "New customer created.";
	}

	@GetMapping
	public @ResponseBody Iterable<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}
}