package com.nashtechglobal.IceCreamWebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.nashtechglobal.IceCreamWebApplication.models.OnlineOrder;

public interface OnlineOrderRepository extends CrudRepository<OnlineOrder, Integer> {
}