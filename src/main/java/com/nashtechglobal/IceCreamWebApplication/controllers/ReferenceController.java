package com.nashtechglobal.IceCreamWebApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.Reference;
import com.nashtechglobal.IceCreamWebApplication.repository.ReferenceRepository;

@Controller
@RequestMapping(path = "/reference")
public class ReferenceController {
	@Autowired
	private ReferenceRepository referenceRepository;

	@PostMapping(path = "/createReference")
	public @ResponseBody String createNewReference(@RequestParam Double monthly_fee, @RequestParam Double yearly_fee,
			@RequestParam Double book_cost) {
		Reference reference = new Reference();
		reference.setMonthly_fee(monthly_fee);
		reference.setYearly_fee(yearly_fee);
		reference.setBook_cost(book_cost);
		referenceRepository.save(reference);
		return "New reference created.";
	}

	@GetMapping
	public @ResponseBody Iterable<Reference> findAllReferences() {
		return referenceRepository.findAll();
	}
}