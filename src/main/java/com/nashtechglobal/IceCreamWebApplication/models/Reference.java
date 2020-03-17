package com.nashtechglobal.IceCreamWebApplication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reference {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reference_id")
	private Integer reference_id;
	@Column(name = "monthly_fee")
	private Double monthly_fee;
	@Column(name = "yearly_fee")
	private Double yearly_fee;
	@Column(name = "book_cost")
	private Double book_cost;

	public Integer getReference_id() {
		return reference_id;
	}

	public void setReference_id(Integer reference_id) {
		this.reference_id = reference_id;
	}

	public Double getMonthly_fee() {
		return monthly_fee;
	}

	public void setMonthly_fee(Double monthly_fee) {
		this.monthly_fee = monthly_fee;
	}

	public Double getYearly_fee() {
		return yearly_fee;
	}

	public void setYearly_fee(Double yearly_fee) {
		this.yearly_fee = yearly_fee;
	}

	public Double getBook_cost() {
		return book_cost;
	}

	public void setBook_cost(Double book_cost) {
		this.book_cost = book_cost;
	}

	public Reference() {
		super();
	}

	public Reference(Integer reference_id, Double monthly_fee, Double yearly_fee, Double book_cost) {
		super();
		this.reference_id = reference_id;
		this.monthly_fee = monthly_fee;
		this.yearly_fee = yearly_fee;
		this.book_cost = book_cost;
	}
}