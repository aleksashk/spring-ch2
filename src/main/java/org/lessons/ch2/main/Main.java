package org.lessons.ch2.main;

import org.lessons.ch2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean("parrot",Parrot.class);
        System.out.println(parrot.getName());

        String strHello = context.getBean(String.class);
        System.out.println(strHello);

        Integer int10 = context.getBean(Integer.class);
        System.out.println(int10);

        Parrot parrotJaco = context.getBean("parrot3",Parrot.class);
        System.out.println(parrotJaco.getName());

    }
}