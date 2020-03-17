package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}