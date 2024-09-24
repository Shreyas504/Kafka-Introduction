package com.shreyas.kafkaintroduction.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {

	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public void generateMessage(String msg) {
		log.info(String.format("Sending messgage to newTopic Topic:: %s", msg));
		kafkaTemplate.send("newTopic", msg);
	}
	
}
