package com.example.demo.springstyle;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Circle circle() {
        return new Circle();
    }

    @Bean
    public Triangle triangle() {
        return new Triangle();
    }
}
