package com.github.famod.modmono_quarkus.dist;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws ClassNotFoundException {
        String result = "class not found";
        try {
            Class.forName("com.github.famod.modmono_quarkus.test.SomeTestSupport");
            result = "class found";
        } catch (ClassNotFoundException e) {
            // ignored
        }
        return result;
    }
}