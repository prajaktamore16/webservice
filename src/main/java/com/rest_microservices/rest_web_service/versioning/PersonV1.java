package com.rest_microservices.rest_web_service.versioning;

import lombok.Data;

@Data
public class PersonV1 {
    private String name;
    public PersonV1(String name) {
        this.name = name;
    }
}
