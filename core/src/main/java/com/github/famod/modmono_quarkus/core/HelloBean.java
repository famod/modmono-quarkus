package com.github.famod.modmono_quarkus.core;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.github.famod.modmono_quarkus.support.SupportInterface;

@ApplicationScoped
public class HelloBean {

    @Inject
    SupportInterface support;

    public String hello() {
        return "hello: " + support.getSupport();
    }
}