package com.order.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.Inventory;

@RestController
@RequestMapping("/api")
public class Inventoryconsumercontroller {
	private final Inventory inventory;

	public Inventoryconsumercontroller(Inventory inventory) {
		super();
		this.inventory = inventory;
	}
	@GetMapping("/orders")
	public List<String> getReceivedOrders(){
		return inventory.getMessage();
	}
}
