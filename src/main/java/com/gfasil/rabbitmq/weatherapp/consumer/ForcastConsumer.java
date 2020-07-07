package com.gfasil.rabbitmq.weatherapp.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ForcastConsumer {

    @Autowired
    ForecastService forecastService;

    @RabbitListener(queues = {"${queue.weather.name}"})
    public void receive(@Payload String cityName){
        forecastService.uploadFromQueue(cityName);
    }
}
