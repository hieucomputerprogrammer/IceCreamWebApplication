package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.PrizeHistory;

public interface PrizeHistoryRepository extends CrudRepository<PrizeHistory, Integer> {
}