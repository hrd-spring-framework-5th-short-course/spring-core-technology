package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/test-whatever/")
    public String testMethod() {

        return "index";
    }


    @GetMapping("/test-whatever1")
    public String testMethod1() {

        return "index1";
    }

    @GetMapping("/users/{id}/comments")
    public String oneUser(@PathVariable Integer id) {

        System.out.println("User ID: " + id);


        return "index";
    }


    @GetMapping("/users") // http://localhost:1234/users?id=
    public String oneUserAnother(@RequestParam(value = "id",
            required = false) Integer userId) {

        System.out.println("User ID: " + userId);


        return "index";
    }

    /*
    @GetMapping("/users")
    public String allUser() {

    }*/

}
