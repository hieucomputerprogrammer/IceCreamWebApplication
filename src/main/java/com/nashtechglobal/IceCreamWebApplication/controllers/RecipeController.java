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

import com.nashtechglobal.IceCreamWebApplication.models.Recipe;
import com.nashtechglobal.IceCreamWebApplication.repository.RecipeRepository;

@Controller
@RequestMapping(path = "/recipe")
public class RecipeController {
	@Autowired
	private RecipeRepository recipeRepository;

	@PostMapping(path = "/createRecipe")
	public @ResponseBody String createNewRecipe(@RequestParam String name, @RequestParam String image,
			@RequestParam String desciption, @RequestParam String details, @RequestParam String author,
			@RequestParam Integer view_number, @RequestParam @DateTimeFormat(pattern = "MMddyyyy") Date upload_date,
			@RequestParam Integer enable_status, @RequestParam String description) {
		Recipe recipe = new Recipe();
		recipe.setName(name);
		recipe.setImage(image);
		recipe.setDesciption(desciption);
		recipe.setDetails(details);
		recipe.setAuthor(author);
		recipe.setView_number(view_number);
		recipe.setUpload_date(upload_date);
		recipe.setEnable_status(enable_status);
		recipe.setDescription(description);
		recipeRepository.save(recipe);
		return "New recipe created.";
	}

	@GetMapping
	public @ResponseBody Iterable<Recipe> findAllRecipes() {
		return recipeRepository.findAll();
	}
}