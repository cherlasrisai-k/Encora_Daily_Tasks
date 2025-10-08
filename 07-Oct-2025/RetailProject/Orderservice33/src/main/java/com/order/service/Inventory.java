package com.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.order.TestOrder;

@Service
public class Inventory {
//	private final TestOrder testOrder;
	private final List<String> message = new ArrayList<>();
//	public Inventory(TestOrder testOrder) {
//		super();
//		this.testOrder = testOrder;
//	}
	@KafkaListener(topics = "${topic.Inventory}",groupId ="Inventory_group" )
	public void consume(String m) {
		System.out.println("Received order + "+m);
		message.add(m);
	}
	public List<String> getMessage(){
		return message;
	}
}
