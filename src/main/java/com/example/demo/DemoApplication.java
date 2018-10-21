package com.example.demo;

import com.example.demo.springstyle.Circle;
import com.example.demo.springstyle.Drawing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(DemoApplication.class, args);


        Drawing drawing = new Drawing();

        Circle circle = context.getBean("circle", Circle.class);

        drawing.setShape(circle);

        drawing.drawing();

    }
}
