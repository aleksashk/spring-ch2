package org.lessons.ch3_new_beans.config;

import org.lessons.ch3_new_beans.beans.Parrot;
import org.lessons.ch3_new_beans.beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.lessons.ch3_new_beans.beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Mikki");
        return p;
    }

    @Bean
    public Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Rikki");
        return p;
    }

    @Bean
public Person person(@Qualifier("parrot3") Parrot parrot) {
        Person p = new Person();
        p.setName("Max");
        p.setParrot(parrot);
        return p;
    }

}
