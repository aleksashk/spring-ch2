package org.lessons.ch3_new_beans.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
//@ComponentScan(basePackages = "org.lessons.ch3_new_beans")
public class Person {
    private String name = "Arkcady";

    //@Autowired
    private final Parrot parrot;
//    private Parrot parrot;

    //если конструктор один то @Autowired не надо
    public Person(@Qualifier("parrot3") Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }

}
