package com.example.helloworld.resources;

import com.example.helloworld.api.Saying;
import com.example.helloworld.service.TestingService;
import com.google.inject.Inject;
import com.google.inject.Provider;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sandeep.naga on 22/05/16.
 */
@Slf4j
@Path("/testing")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestingResource {

    AtomicLong counter ;
    TestingService testingService = null;

    @Inject
    public TestingResource(Provider<TestingService> testingServiceProvider)
    {
      this.testingService = testingServiceProvider.get();
        System.out.println("****SANDEEP***var n n  is"+ testingService.getFirstVar());
        this.testingService.setFirstVar("changed first var");
        System.out.println("variable name in member class is" + this.testingService.getFirstVar());
        System.out.println("after changing name is"+ testingServiceProvider.get().getFirstVar());
        this.counter =  new AtomicLong();

    }


    @GET
    @Path("/abcd")
    public Saying testing()
    {
        System.out.println("aaaaaa bbbbb ********");
        System.out.println("number is "+ counter.incrementAndGet());
        return new Saying(counter.incrementAndGet(), "abc");
    }

}
