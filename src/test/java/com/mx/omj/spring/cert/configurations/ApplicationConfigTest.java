package com.mx.omj.spring.cert.configurations;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationConfigTest {

    @Test
    public void testConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }
}
