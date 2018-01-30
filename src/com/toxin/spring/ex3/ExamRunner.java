package com.toxin.spring.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-ex3.xml");

        Exam exam = (Exam)context.getBean("exam");
        exam.examCheck();
    }
}
