package com.example.demo.springstyle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Drawing {

    @Autowired
    @Qualifier("triangle_bean")
    private Shape shape ;

    private String desc;

    private Shape shape1 = new Triangle();

    public Drawing() {
    }

    public Drawing(String desc, Shape shape1) {
        this.desc = desc;
        this.shape1 = shape1;
    }

    public Shape getShape() {
        return shape;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Shape getShape1() {
        return shape1;
    }

    public void setShape1(Shape shape1) {
        this.shape1 = shape1;
    }

    //    @Autowired
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawing() {
        this.shape.draw();
    }

    @PostConstruct
    public void init(){
        System.out.println("Drawing Object init!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Drawing object destroy!");
    }

}
