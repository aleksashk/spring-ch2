package org.lessons.ch2.config;

import org.lessons.ch2.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("Robert")
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName(" Robert");
        return parrot;
    }

    @Bean
    @Primary
    Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName(" Marcus");
        return parrot;
    }

    @Bean
    Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName(" Jaco");
        return parrot;
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
