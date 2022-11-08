package com.amazonOrder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonOrder.model.Orders;
import com.amazonOrder.repository.OrderRepository;
import com.amazonOrder.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController 
{
	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/add")
	public Orders addDetail(@RequestBody Orders cus)
	{
		return repo.save(cus);
	}
	
	@GetMapping("/getall")
	public List<Orders> getDetails()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/get/{id}")
	public Orders getDetail(@PathVariable Long id)
	{
		Orders cus = service.getCustomer(id);	
		return cus;		
	}
	
	@PutMapping("/update")
	public Orders putDetail(@RequestBody Orders cus)
	{
		return repo.save(cus);
	}
	
	@DeleteMapping("/delete/{cId}")
	public void delete(@PathVariable Long cId)
	{
		repo.deleteById(cId);
	}
}
