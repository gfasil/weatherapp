package com.gfasil.rabbitmq.weatherapp.consumer;

import org.springframework.stereotype.Service;

@Service
public class ForecastService {


    public void uploadFromQueue(String cityName){
        System.out.println("forecast for city"+ cityName);
    }
}
