package org.lessons.ch5_scope_and_lifecycle_of_bean.singleton_scope.by_lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    }
}
