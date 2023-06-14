package com.rest_microservices.rest_web_service.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonFilter("SomeBeanFilter")
//@JsonIgnoreProperties({"field1","field2"})
public class SomeBean {
    private String field1;
//    @JsonIgnore
    private String field2;
    private String field3;


    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
}
