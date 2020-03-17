package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
}
