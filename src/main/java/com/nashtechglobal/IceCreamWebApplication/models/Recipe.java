package com.nashtechglobal.IceCreamWebApplication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recipe_id")
	private Integer recipe_id;
	@Column(name = "name")
	private String name;
	@Column(name = "image")
	private String image;
	@Column(name = "desciption")
	private String desciption;
	@Column(name = "details")
	private String details;
	@Column(name = "author")
	private String author;
	@Column(name = "view_number")
	private Integer view_number;
	@Column(name = "upload_date")
	private Date upload_date;
	@Column(name = "enable_status")
	private Integer enable_status;
	@Column(name = "description")
	private String description;

	public Integer getRecipe_id() {
		return recipe_id;
	}

	public void setRecipe_id(Integer recipe_id) {
		this.recipe_id = recipe_id;
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

	public String getDescription() {
		return desciption;
	}

	public void setDescription(String description) {
		this.desciption = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getView_number() {
		return view_number;
	}

	public void setView_number(Integer view_number) {
		this.view_number = view_number;
	}

	public Date getUpload_date() {
		return upload_date;
	}

	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}

	public Integer getEnable_status() {
		return enable_status;
	}

	public void setEnable_status(Integer enable_status) {
		this.enable_status = enable_status;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public Recipe() {
		super();
	}

	public Recipe(Integer recipe_id, String name, String image, String desciption, String details, String author,
			Integer view_number, Date upload_date, Integer enable_status, String description) {
		super();
		this.recipe_id = recipe_id;
		this.name = name;
		this.image = image;
		this.desciption = desciption;
		this.details = details;
		this.author = author;
		this.view_number = view_number;
		this.upload_date = upload_date;
		this.enable_status = enable_status;
		this.description = description;
	}
}