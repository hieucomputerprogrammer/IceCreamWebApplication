package com.nashtechglobal.IceCreamWebApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nashtechglobal.IceCreamWebApplication.models.PrizeHistory;
import com.nashtechglobal.IceCreamWebApplication.repository.PrizeHistoryRepository;

@Controller
@RequestMapping(path = "/prizeHistory")
public class PrizeHistoryController {
	@Autowired
	private PrizeHistoryRepository prizeHistoryRepository;

	@PostMapping(path = "/createPrizeHistory")
	public @ResponseBody String createPrizeHistoryRepository(@RequestParam Integer enable_status) {
		PrizeHistory prizeHistory = new PrizeHistory();
		prizeHistory.setEnable_status(enable_status);
		prizeHistoryRepository.save(prizeHistory);
		return "New prize history created.";
	}

	@GetMapping
	public @ResponseBody Iterable<PrizeHistory> findAllPrizeHistory() {
		return prizeHistoryRepository.findAll();
	}
}