package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}