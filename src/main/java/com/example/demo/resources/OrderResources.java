package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.Order;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

	@Autowired
	private OrderService OrderService;
	
	@Autowired
	private OrderRepository OrderRepository;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		
		List<Order> Orders =OrderRepository.findAll();

		return ResponseEntity.ok().body(Orders);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = OrderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}