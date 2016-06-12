package com.example.helloworld.filters;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.IOException;


/**
 * Created by sandeep.naga on 12/06/16.
 */
@Slf4j
public class DateNotSpecifiedFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        String dateHeader = requestContext.getHeaderString(HttpHeaders.DATE);
      log.error("INSIDE FILTER METHOD ***************************");
        if (dateHeader == null) {
            Exception cause = new IllegalArgumentException("Date Header was not specified");
            throw new WebApplicationException(cause, Response.Status.BAD_REQUEST);
        }
    }
}
