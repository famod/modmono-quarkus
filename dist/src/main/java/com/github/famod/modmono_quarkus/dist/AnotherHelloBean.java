package com.github.famod.modmono_quarkus.dist;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnotherHelloBean {

    public String hello() {
        return "anotherHello";
    }
}
