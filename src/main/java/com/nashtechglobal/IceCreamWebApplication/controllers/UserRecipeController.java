package com.nashtechglobal.IceCreamWebApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.Customer;
import com.nashtechglobal.IceCreamWebApplication.models.UserRecipe;
import com.nashtechglobal.IceCreamWebApplication.repository.UserRecipeRepository;

@Controller
@RequestMapping(path = "/userRecipe")
public class UserRecipeController {
	@Autowired
	private UserRecipeRepository userRecipeRepository;

	@PostMapping(path = "/createUserRecipe")
	public @ResponseBody String createNewUserRecipe(@RequestParam String name, @RequestParam String image,
			@RequestParam String desciption, @RequestParam String details, @RequestParam Customer customer, @RequestParam Integer prize_status, @RequestParam Integer enable_status, @RequestParam String description) {
		UserRecipe userRecipe = new UserRecipe();
		userRecipe.setName(name);
		userRecipe.setImage(image);
		userRecipe.setDesciption(desciption);
		userRecipe.setDetails(details);
		userRecipe.setCustomer(customer);
		userRecipe.setPrize_status(prize_status);
		userRecipe.setEnable_status(enable_status);
		userRecipe.setDescription(description);
		userRecipeRepository.save(userRecipe);
		return "New user recipe created.";
	}

	@GetMapping
	public @ResponseBody Iterable<UserRecipe> findAllUserRecipe() {
		return userRecipeRepository.findAll();
	}
}