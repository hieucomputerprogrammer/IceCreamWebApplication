package com.nashtechglobal.IceCreamWebApplication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "feedback_id")
	private Integer feedback_id;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;
	@Column(name = "full_name")
	private String full_name;

	public Integer getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(Integer feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public Feedback() {
		super();
	}

	public Feedback(Integer feedback_id, String fullname, String title, String content, String full_name) {
		super();
		this.feedback_id = feedback_id;
		this.fullname = fullname;
		this.title = title;
		this.content = content;
		this.full_name = full_name;
	}
}