package com.enit.usercrud.security.services;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class KafkaConsumer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	//kafka listener
	@KafkaListener(
			topicPartitions = @TopicPartition(topic = "usersProfiles",partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")    ))
	public void listenToParition(@Payload String message) {
		System.out.println("Received Messasge: " + message );
	}


}
