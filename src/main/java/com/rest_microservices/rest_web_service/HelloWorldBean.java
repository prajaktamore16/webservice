package com.rest_microservices.rest_web_service;

import lombok.Data;

@Data
public class HelloWorldBean {
    private String message;
    public HelloWorldBean(String message) {
        this.message= message;
    }
    public String toStirng(){
        return "Hello worldBean [message =" +message +"]";
    }
}
