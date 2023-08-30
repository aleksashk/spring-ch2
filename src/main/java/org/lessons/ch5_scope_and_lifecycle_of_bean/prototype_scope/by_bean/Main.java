package org.lessons.ch5_scope_and_lifecycle_of_bean.prototype_scope.by_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = context.getBean("commentService", CommentService.class);
        var s2 = context.getBean("commentService", CommentService.class);

        boolean isSameObject = s1 == s2;
        System.out.println(isSameObject);
    }
}
