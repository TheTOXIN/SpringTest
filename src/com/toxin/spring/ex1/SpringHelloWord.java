package com.toxin.spring.ex1;

import org.springframework.beans.factory.DisposableBean;

public class SpringHelloWord implements DisposableBean {
    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public void initBean() {
        System.out.println("INIT-" + this);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DESTROY-" + this);
    }
}
