package org.lessons.ch2.config;

import org.lessons.ch2.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName(" Coco");
        return parrot;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
