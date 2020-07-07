package com.gfasil.rabbitmq.weatherapp;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableRabbit
public class WeatherappApplication {

    @Value("${queue.weather.name}")
    private String weatherQueue;
    public static void main(String[] args) {
        SpringApplication.run(WeatherappApplication.class, args);
    }
    @Bean
    public Queue queue(){
        return new Queue(weatherQueue,true);
    }

}
