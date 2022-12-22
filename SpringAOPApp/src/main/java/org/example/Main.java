package org.example;

import org.example.service.IMetier;
import org.example.service.SecurityContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"org.example"})
public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("roo t","1234",new String[]{"USER","ADMIN"});
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext("org.example.service", "org.example.aspect");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("*********************");
        System.out.println(metier.getClass().getName());
        System.out.println("**********************");
        metier.process();
        System.out.println(metier.compute());
    }
}