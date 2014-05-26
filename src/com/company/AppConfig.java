package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by java on 26.05.14.
 */

@Configuration
@ComponentScan("com.company")
public class AppConfig {

    @Bean(name = "renDerer")
    public Renderer getRenderer() {
        return new Renderer();
    }
}
