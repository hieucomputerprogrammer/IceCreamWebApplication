package com.nashtechglobal.IceCreamWebApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.FAQ;
import com.nashtechglobal.IceCreamWebApplication.repository.FAQRepository;

@Controller
@RequestMapping(path = "/faq")
public class FAQController {
	@Autowired
	private FAQRepository faqRepository;

	@PostMapping(path = "/createFAQ")
	public @ResponseBody String createNewFAQ(@RequestParam String question, @RequestParam String answer) {
		FAQ faq = new FAQ();
		faq.setQuestion(question);
		faq.setAnswer(answer);
		faqRepository.save(faq);
		return "New FAQ created.";
	}

	@GetMapping
	public @ResponseBody Iterable<FAQ> findAllFAQs() {
		return faqRepository.findAll();
	}
}