package com.toxin.spring.ex2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MessageRunnerWithBeanFactory {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-hello-bean.xml"));

        Message message = (Message)xmlBeanFactory.getBean("message");

        System.out.println("First BEAN:");
        message.setMessage("Hello scope TEST singleton");
        System.out.println(message.getMessage());

        System.out.println("===================================");

        MessageToYou newMessage = (MessageToYou)xmlBeanFactory.getBean("messageToYou");
        System.out.println("Second BEAN:");
        System.out.println(newMessage.getMessage());
        System.out.println(newMessage.getMessageToYou());
    }
}
