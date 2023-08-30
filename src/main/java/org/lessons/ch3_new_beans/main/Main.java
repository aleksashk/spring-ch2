package org.lessons.ch3_new_beans.main;

import org.lessons.ch3_new_beans.beans.Parrot;
import org.lessons.ch3_new_beans.beans.Person;
import org.lessons.ch3_new_beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person personBean = context.getBean(Person.class);

//        Parrot parrotBean = context.getBean(Parrot.class);

        System.out.println("Person's name is: " + personBean.getName());
//        System.out.println("Parrot's name is: " + parrotBean.getName());
        System.out.println("Person's parrot is: " + personBean.getParrot());
    }
}
