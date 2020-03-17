package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
}