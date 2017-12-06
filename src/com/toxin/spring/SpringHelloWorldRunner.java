package com.toxin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        SpringHelloWord springHelloWord = (SpringHelloWord) context.getBean("springHelloWorld");
        System.out.println(springHelloWord.getHelloMessage());
    }
}
