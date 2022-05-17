package com.huskynz.hunzwebsite;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World! Im HuskyNZ's new site welcome to my new site!";
    }
}