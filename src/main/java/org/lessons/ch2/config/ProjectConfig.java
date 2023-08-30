package org.lessons.ch2.config;

import org.lessons.ch2.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("Jacklin")
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName(" Jacklin");
        return parrot;
    }
 @Bean
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
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
