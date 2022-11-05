package com.bofa.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String hello(){
        StringBuffer sb = new StringBuffer();
        sb.append("<HTML><Body style=\"background: lightblue\">");
        sb.append("<h1 aline=\"center\"> Welcome to Spring Boot Application</h>");
        sb.append("</Body></html>");

        return sb.toString();

    }
}
