package com.github.famod.modmono_quarkus.core.testlib;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.github.famod.modmono_quarkus.core.HelloBean;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HelloBeanTest {

    @Inject
    HelloBean underTest;

    @Test
    void test() {
        underTest.hello();
    }
}
