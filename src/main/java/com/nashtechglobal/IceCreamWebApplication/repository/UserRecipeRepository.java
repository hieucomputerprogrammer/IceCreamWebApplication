package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.UserRecipe;

public interface UserRecipeRepository extends CrudRepository<UserRecipe, Integer> {
}