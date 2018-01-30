package com.toxin.spring.ex6;

public class Address {
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void goTo() {
        System.out.println("GOTO -> " + street);
    }
}
