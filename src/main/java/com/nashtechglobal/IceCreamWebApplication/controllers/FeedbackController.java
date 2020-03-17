package com.nashtechglobal.IceCreamWebApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.Feedback;
import com.nashtechglobal.IceCreamWebApplication.repository.FeedbackRepository;

@Controller
@RequestMapping(path = "/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackRepository feedbackRepository;

	@PostMapping(path = "/createFeedback")
	public @ResponseBody String createFeedback(@RequestParam String fullname, @RequestParam String title, @RequestParam String content, @RequestParam String full_name) {
		Feedback feedback = new Feedback();
		feedback.setFullname(fullname);
		feedback.setTitle(title);
		feedback.setContent(content);
		feedback.setFull_name(full_name);
		feedbackRepository.save(feedback);
		return "New feedback created.";
	}

	@GetMapping
	public @ResponseBody Iterable<Feedback> findAllFeedbacks() {
		return feedbackRepository.findAll();
	}
}