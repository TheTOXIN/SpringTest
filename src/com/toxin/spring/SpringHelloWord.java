package com.toxin.spring;

public class SpringHelloWord {
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

    public void destrBean() {
        System.out.println("DESTROY-" + this);
    }
}
