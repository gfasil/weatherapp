package com.gfasil.rabbitmq.weatherapp.consumer.MessageSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ForeCastSenderService {

@Autowired
private WeatherQueueSender weatherQueueSender;
List<String> cities=new ArrayList<>();

public ForeCastSenderService(){
    cities= Arrays.asList("FairField","Washington");
}
    public String sendMessageToUpload() {

        cities.forEach(arg-> weatherQueueSender.send(arg));
   return "sent";
    }
}
