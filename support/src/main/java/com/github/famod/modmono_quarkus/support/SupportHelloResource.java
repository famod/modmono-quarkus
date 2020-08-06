package com.github.famod.modmono_quarkus.support;

import com.github.famod.modmono_quarkus.core.HelloBean;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/support-hello")
public class SupportHelloResource {

    @Inject
    HelloBean bean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public @NotNull String hello() {
        return bean.hello() + "!";
    }
}