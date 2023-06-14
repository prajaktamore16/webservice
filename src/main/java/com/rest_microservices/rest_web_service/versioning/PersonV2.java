package com.rest_microservices.rest_web_service.versioning;

import lombok.Data;

@Data
public class PersonV2 {
    private Name name;
    public PersonV2(Name name) {
        super();
        this.name = name;
    }
    public String toString(){
        return "PersonV2 [name =" + name + " ]";
    }
}
