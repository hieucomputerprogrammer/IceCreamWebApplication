package com.nashtechglobal.IceCreamWebApplication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer customer_id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "email")
	private String email;
	@Column(name = "gender")
	private Integer gender;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "avatar")
	private String avatar;
	@Column(name = "expired_date")
	private Date expired_date;
	@Column(name = "enable_status")
	private Integer enable_status;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getExpired_date() {
		return expired_date;
	}

	public void setExpired_date(Date expired_date) {
		this.expired_date = expired_date;
	}

	public Integer getEnable_status() {
		return enable_status;
	}

	public void setEnable_status(Integer enable_status) {
		this.enable_status = enable_status;
	}

	public Customer() {
		super();
	}

	public Customer(Integer customer_id, String username, String password, String fullname, String address,
			String phone_number, String email, Integer gender, Date birthday, String avatar, Date expired_date,
			Integer enable_status) {
		super();
		this.customer_id = customer_id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.avatar = avatar;
		this.expired_date = expired_date;
		this.enable_status = enable_status;
	}
}