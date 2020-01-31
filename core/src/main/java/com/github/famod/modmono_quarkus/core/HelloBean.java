package com.github.famod.modmono_quarkus.core;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloBean {

    public String hello() {
        return "hellooo";
    }
}