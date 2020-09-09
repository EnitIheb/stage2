package com.enit.serving2.kafkaConsumer;


import com.enit.serving2.configuration.EventService;

import com.enit.serving2.configuration.MyStream;
import com.enit.serving2.entity.ConsumerRequest;
import com.enit.serving2.entity.ListRecommandation;
import com.enit.serving2.events.Event;
import com.enit.serving2.events.LogInUserEvent;
import com.enit.serving2.repository.RedisAdRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
@Component

public class GreetingsListener {
    private long counter=0;
    @Autowired
    RedisAdRepository adsService;

    private final EventService kafkaTemplate;
    public  GreetingsListener(EventService eventService){
        this.kafkaTemplate=eventService;
    }
    @StreamListener(MyStream.INPUT_LOGIN)
    public void handleLoginRequest(@Payload String login) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();


        System.out.println(login);
        LogInUserEvent loginEvent = objectMapper.readValue(login, LogInUserEvent.class);
        ConsumerRequest consumerRequest = new ConsumerRequest(loginEvent.getUsername(), loginEvent.getLatitude(), loginEvent.getLongitude());
        adsService.delete(consumerRequest.getUsername());
        System.out.println("hello 1");
        kafkaTemplate.sendUserRequest( consumerRequest);
        System.out.println("hello 2");
    }

    @StreamListener(MyStream.INPUT_RECOMMANDATION)
    public void handleUserRecommandation(@Payload String recommandations) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("recString: "+recommandations);
        ListRecommandation list = mapper.readValue(recommandations, ListRecommandation.class);
        list.getListRecommandation().forEach(rec -> {adsService.save(rec.getUsername(),Long.toString(counter),rec.getAd());counter++;});


        System.out.println("Recommandation saved in memory");

    }
}