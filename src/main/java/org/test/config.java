package org.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public HelloWorld getHellWorld()
    {
        return new HelloWorld();
    }
}
