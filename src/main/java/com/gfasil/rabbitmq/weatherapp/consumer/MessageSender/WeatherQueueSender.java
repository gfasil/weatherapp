package com.gfasil.rabbitmq.weatherapp.consumer.MessageSender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherQueueSender {

    @Autowired
    RabbitTemplate  rabbitTemplate;
}
