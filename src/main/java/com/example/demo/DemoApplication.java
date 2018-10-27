package com.example.demo;

import com.example.demo.springstyle.Drawing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScans({
//        @ComponentScan("com.example"),
//        @ComponentScan("com.example")
//})
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(DemoApplication.class, args);

        Drawing drawing1 = context.getBean("drawing", Drawing.class);
        drawing1.setDesc("Drawing 1 desc");

        Drawing drawing2 = context.getBean("drawing", Drawing.class);
        drawing2.setDesc("Drawing 2 desc");

//        Circle circle = context.getBean("circle", Circle.class);

//        drawing.setShape(circle);

        System.out.println(drawing1.getDesc());
        System.out.println(drawing2.getDesc());

        drawing1.drawing();

        ((ConfigurableApplicationContext) context).close();

    }
}
