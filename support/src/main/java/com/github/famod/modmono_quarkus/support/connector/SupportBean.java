package com.github.famod.modmono_quarkus.support.connector;

import javax.enterprise.context.ApplicationScoped;

import com.github.famod.modmono_quarkus.support.SupportInterface;

@ApplicationScoped
public class SupportBean implements SupportInterface {

    @Override
    public String getSupport() {
        return "real support";
    }

}
