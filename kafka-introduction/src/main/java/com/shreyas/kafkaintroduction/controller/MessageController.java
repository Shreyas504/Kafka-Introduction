package com.shreyas.kafkaintroduction.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreyas.kafkaintroduction.producer.KafkaProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
	
	private final KafkaProducer kafkaProducer;
	
	@PostMapping
	public ResponseEntity<String> sendMessage(
			@RequestBody String message){
		kafkaProducer.generateMessage(message);
		return ResponseEntity.ok("Message queued successfully");
	}
	

}
