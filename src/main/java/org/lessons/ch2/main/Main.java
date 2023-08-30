package org.lessons.ch2.main;

import org.lessons.ch2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        String strHello = context.getBean(String.class);
//        System.out.println(strHello);
//
//        Integer int10 = context.getBean(Integer.class);
//        System.out.println(int10);

        //с помощью @Bean
        Parrot parrotJacklin = context.getBean("Robert", Parrot.class);
        System.out.println(parrotJacklin.getName());

        //с помощью @Component и @ComponentScan(basePackage="org.lessons.ch2.main") и @PostConstruct
        Cat catBean = context.getBean(Cat.class);
        System.out.println(catBean.getName());

        //Программный способ
        Dog ourDog = new Dog();
        Supplier<Dog> dogSupplier = () -> ourDog;

        context.registerBean(
                "Sharik",
                Dog.class,
                dogSupplier,
                dog -> dog.setPrimary(true));

        Dog sharik = context.getBean(Dog.class);
        System.out.println(sharik.bark());

    }
}