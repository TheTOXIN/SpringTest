package com.toxin.spring.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-ex4.xml");

        CollectionInjection collectionInjection =
                (CollectionInjection) context.getBean("collectionInjection");

        collectionInjection.getDocumentList();
        collectionInjection.getDocumentSet();
        collectionInjection.getDocumentMap();
        collectionInjection.getDocumentProp();
    }
}
