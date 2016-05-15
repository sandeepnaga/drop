package com.example.helloworld.resources;

import com.example.helloworld.api.Saying;
import com.example.helloworld.service.HelloWorldService;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.concurrent.atomic.AtomicLong;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;


@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    
    private HelloWorldService helloWorldService;
    
    

    public HelloWorldService getHelloWorldService() {
		return helloWorldService;
	}

    @Inject
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

    @Inject
	public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
        
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        log.error("something is wrong");
        log.error("buidl success");

        helloWorldService.callPrintFunction();
        return new Saying(counter.incrementAndGet(), value);
    }
}