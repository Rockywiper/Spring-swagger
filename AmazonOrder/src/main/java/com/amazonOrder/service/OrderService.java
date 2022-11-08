package com.amazonOrder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonOrder.model.Orders;
import com.amazonOrder.repository.OrderRepository;


@Service
public class OrderService 
{
	@Autowired
	private OrderRepository repo;
	
	public Orders getCustomer(Long id)
	{
		List<Orders> cus = repo.findAll();	
		return cus.stream().filter(c -> c.getoId().equals(id)).findAny().orElse(null);	
	}
}
