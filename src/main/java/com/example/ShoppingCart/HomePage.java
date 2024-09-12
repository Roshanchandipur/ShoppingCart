package com.example.ShoppingCart;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomePage {

    @RequestMapping("/apiHealth")
    public String healthCheck(){
        return "API services are running...";
    }

    @RequestMapping("/")
    public String homePage(){
        return "Hello this is my HOME API";
    }
    public void print(){
        System.out.println("hello there");
    }
}
