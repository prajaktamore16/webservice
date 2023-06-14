package com.rest_microservices.rest_web_service.versioning;

import lombok.Data;

@Data
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
