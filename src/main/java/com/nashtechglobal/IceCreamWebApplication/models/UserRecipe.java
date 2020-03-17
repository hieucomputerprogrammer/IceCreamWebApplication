package com.nashtechglobal.IceCreamWebApplication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserRecipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_recipe_id")
	private Integer user_recipe_id;
	@Column(name = "name")
	private String name;
	@Column(name = "image")
	private String image;
	@Column(name = "desciption")
	private String desciption;
	@Column(name = "details")
	private String details;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	@Column(name = "prize_status")
	private Integer prize_status;
	@Column(name = "enable_status")
	private Integer enable_status;
	@Column(name = "description")
	private String description;

	public Integer getUser_recipe_id() {
		return user_recipe_id;
	}

	public void setUser_recipe_id(Integer user_recipe_id) {
		this.user_recipe_id = user_recipe_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getPrize_status() {
		return prize_status;
	}

	public void setPrize_status(Integer prize_status) {
		this.prize_status = prize_status;
	}

	public Integer getEnable_status() {
		return enable_status;
	}

	public void setEnable_status(Integer enable_status) {
		this.enable_status = enable_status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserRecipe() {
		super();
	}

	public UserRecipe(Integer user_recipe_id, String name, String image, String desciption, String details,
			Customer customer, Integer prize_status, Integer enable_status, String description) {
		super();
		this.user_recipe_id = user_recipe_id;
		this.name = name;
		this.image = image;
		this.desciption = desciption;
		this.details = details;
		this.customer = customer;
		this.prize_status = prize_status;
		this.enable_status = enable_status;
		this.description = description;
	}
}