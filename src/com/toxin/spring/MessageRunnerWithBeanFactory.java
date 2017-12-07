package com.toxin.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MessageRunnerWithBeanFactory {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-hello-bean.xml"));
        Message message = (Message)xmlBeanFactory.getBean("messageFromBean");
        message.setMessage("Hello scope TEST singleton");
        System.out.println(message.getMessage());
        Message newMessage = (Message)xmlBeanFactory.getBean("messageFromBean");
        System.out.println(message.getMessage());
    }
}
