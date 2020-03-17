package com.nashtechglobal.IceCreamWebApplication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OnlineOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Integer order_id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "contact")
	private String contact;
	@Column(name = "address")
	private String address;
	@Column(name = "book_cost")
	private Double book_cost;
	@Column(name = "paying_option")
	private String paying_option;
	@Column(name = "order_date")
	private Date order_date;
	@Column(name = "status")
	private Integer status;

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getBook_cost() {
		return book_cost;
	}

	public void setBook_cost(Double book_cost) {
		this.book_cost = book_cost;
	}

	public String getPaying_option() {
		return paying_option;
	}

	public void setPaying_option(String paying_option) {
		this.paying_option = paying_option;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public OnlineOrder() {
		super();
	}

	public OnlineOrder(Integer order_id, String name, String email, String contact, String address, Double book_cost,
			String paying_option, Date order_date, Integer status) {
		super();
		this.order_id = order_id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.book_cost = book_cost;
		this.paying_option = paying_option;
		this.order_date = order_date;
		this.status = status;
	}
}