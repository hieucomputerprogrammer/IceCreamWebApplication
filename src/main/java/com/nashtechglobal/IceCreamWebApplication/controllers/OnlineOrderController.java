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

import com.nashtechglobal.IceCreamWebApplication.models.OnlineOrder;
import com.nashtechglobal.IceCreamWebApplication.repository.OnlineOrderRepository;

@Controller
@RequestMapping(path = "/onlineOrder")
public class OnlineOrderController {
	@Autowired
	private OnlineOrderRepository onlineOrderRepository;

	@PostMapping(path = "/createOnlineOrder")
	public @ResponseBody String createNewOnlineOrder(@RequestParam String name, @RequestParam String email,
			@RequestParam String contact, @RequestParam String address, @RequestParam double book_cost,
			@RequestParam String paying_option, @RequestParam @DateTimeFormat(pattern = "MMddyyyy") Date order_date, @RequestParam Integer status) {
		OnlineOrder onlineOrder = new OnlineOrder();
		onlineOrder.setName(name);
		onlineOrder.setEmail(email);
		onlineOrder.setContact(contact);
		onlineOrder.setAddress(address);
		onlineOrder.setBook_cost(book_cost);
		onlineOrder.setPaying_option(paying_option);
		onlineOrder.setOrder_date(order_date);
		onlineOrder.setStatus(status);
		onlineOrderRepository.save(onlineOrder);
		return "New online order created.";
	}

	@GetMapping
	public @ResponseBody Iterable<OnlineOrder> findAllOnlineOrders() {
		return onlineOrderRepository.findAll();
	}
}