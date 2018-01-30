package com.toxin.spring.ex6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public User user() {
        return new User("TOXIN", address());
    }

    @Bean
    public Address address() {
        return new Address();
    }
}
