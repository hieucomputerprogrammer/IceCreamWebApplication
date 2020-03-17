package com.nashtechglobal.IceCreamWebApplication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class PrizeHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_recipe_id")
	private Integer user_recipe_id;
	@Column(name = "enable_status")
	@Value("${some.key:0}")
	private Integer enable_status;

	public Integer getUser_recipe_id() {
		return user_recipe_id;
	}

	public void setUser_recipe_id(Integer user_recipe_id) {
		this.user_recipe_id = user_recipe_id;
	}

	public Integer getEnable_status() {
		return enable_status;
	}

	public void setEnable_status(Integer enable_status) {
		this.enable_status = enable_status;
	}

	public PrizeHistory() {
		super();
	}

	public PrizeHistory(Integer user_recipe_id, Integer enable_status) {
		super();
		this.user_recipe_id = user_recipe_id;
		this.enable_status = enable_status;
	}
}