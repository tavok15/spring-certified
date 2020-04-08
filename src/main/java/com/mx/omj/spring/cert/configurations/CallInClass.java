package com.mx.omj.spring.cert.configurations;

import com.mx.omj.spring.cert.services.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CallInClass {

    public static void main(String...a){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TransferService ts = (TransferService) context.getBean("transferService");
        System.out.println(ts.goodMornig("Octavio"));
    }
}
