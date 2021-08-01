package com.github.famod.modmono_quarkus.core.testlib;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import org.mockito.Mockito;

import com.github.famod.modmono_quarkus.support.SupportInterface;

import io.quarkus.arc.AlternativePriority;

public class SupportMockProducer {

    static {
        System.err.println(":::: " + SupportMockProducer.class.getProtectionDomain().getCodeSource().getLocation());
    }

    @Produces
    @RequestScoped
    @AlternativePriority(-1)
    SupportInterface produceMock() {
        return Mockito.mock(SupportInterface.class);
    }
}
