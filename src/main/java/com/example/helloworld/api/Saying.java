package com.example.helloworld.api;

import io.dropwizard.jackson.JsonSnakeCase;
import org.hibernate.validator.constraints.Length;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;
import java.io.IOException;
import java.io.OutputStream;


@JsonSnakeCase
public class Saying  {
    private long id;

    @Length(max = 3)
    private String contentValue;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String contentValue) {
        this.id = id;
        this.contentValue = contentValue;
    }

    //@JsonProperty
    public long getId() {
        return id;
    }

    //@JsonProperty
    public String getContentValue() {
        return contentValue;
    }



}