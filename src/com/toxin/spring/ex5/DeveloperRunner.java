package com.toxin.spring.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                 new ClassPathXmlApplicationContext("spring-config-ex5.xml");

        Developer developer = (Developer) context.getBean("developer");
        System.out.println(developer);
    }
}
