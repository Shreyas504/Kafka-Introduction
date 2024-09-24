package com.shreyas.kafkaintroduction.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "newTopic", groupId = "myGroup")
	public void consumeMessage(String msg) {
		log.info(String.format("Consuming the message from newTopic Topic:: %s", msg));
		
	}
}
