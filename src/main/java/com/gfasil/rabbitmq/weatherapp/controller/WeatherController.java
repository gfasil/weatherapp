package com.gfasil.rabbitmq.weatherapp.controller;

import com.gfasil.rabbitmq.weatherapp.consumer.MessageSender.ForeCastSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private ForeCastSenderService foreCastSenderService;

    @GetMapping("/sendForecast")
    public String send(){

        return foreCastSenderService.sendMessageToUpload();
    }
}
