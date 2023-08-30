package org.lessons.ch2.main;

import org.lessons.ch2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String strHello = context.getBean(String.class);
        System.out.println(strHello);

        Integer int10 = context.getBean(Integer.class);
        System.out.println(int10);

        Parrot parrotJacklin = context.getBean("Robert",Parrot.class);
        System.out.println(parrotJacklin.getName());

        Cat catBean = context.getBean(Cat.class);
        System.out.println(catBean.getName());

    }
}