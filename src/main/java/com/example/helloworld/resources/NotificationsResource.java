package com.example.helloworld.resources;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;

import io.dropwizard.jersey.params.LongParam;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.Response;

import com.example.helloworld.request.Notification;
import lombok.extern.slf4j.Slf4j;

@Path("/{user}/notifications")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Slf4j
public class NotificationsResource {

  @Setter @Getter  private Notification notification;


    @POST
    @Metered

    public Response add(@PathParam("user") LongParam userId,Notification paramNotification){
      log.info("user value is"+userId);
      notification = new Notification();
      //notification.setId(userId.get());
      //notification.setMessage("sample message");
        //log.info("json format is"+ notification.);

        this.notification = paramNotification;
        log.info("this notification value is "+this.notification.getMessage());
      return Response.created(UriBuilder.fromResource(NotificationsResource.class).build(2,3)).build();

    }
}
