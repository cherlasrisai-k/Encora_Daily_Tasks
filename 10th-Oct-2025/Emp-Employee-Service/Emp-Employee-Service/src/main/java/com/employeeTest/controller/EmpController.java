package com.employeeTest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employees")
public class EmpController {
	@Autowired
	private RestTemplate restTemplate;
	
	//@SuppressWarnings("unchecked")
	@GetMapping("/getOrder/{id}")
	public Map<String, Object> getOrderDetails(@PathVariable("id") int id)
	{
		String url = "http://localhost:8081/order/"+id;
		Map<String, Object> response = restTemplate.getForObject(url, Map.class);
		response.put("message", "Order fetched successfully");
		return response;
	}
	@GetMapping("/info")
	public String getOrderInfo() {
		return "Order Completed";
	}
}
