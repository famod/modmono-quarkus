package com.github.famod.modmono_quarkus.dist;

import com.github.famod.modmono_quarkus.core.HelloBean;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    HelloBean bean;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return bean.hello() + "!";
    }
}