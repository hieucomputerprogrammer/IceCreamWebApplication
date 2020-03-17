package com.nashtechglobal.IceCreamWebApplication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FAQ {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "faq_id")
	private Integer faq_id;
	@Column(name = "question")
	private String question;
	@Column(name = "answer")
	private String answer;

	public Integer getFaq_id() {
		return faq_id;
	}

	public void setFaq_id(Integer faq_id) {
		this.faq_id = faq_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public FAQ() {
		super();
	}

	public FAQ(Integer faq_id, String question, String answer) {
		super();
		this.faq_id = faq_id;
		this.question = question;
		this.answer = answer;
	}
}