package com.enit.usercrud.service;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import com.enit.usercrud.events.Event;
import com.enit.usercrud.events.RegisterEvent;
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
	KafkaTemplate<String, RegisterEvent> kafkaTemplate;
	//kafka listener
	@KafkaListener(
			topicPartitions = @TopicPartition(topic = "usersProfiles",partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")    ))
	public void listenToParition(@Payload RegisterEvent message) {

		System.out.println("Received Messasge: " + message );
	}


}
