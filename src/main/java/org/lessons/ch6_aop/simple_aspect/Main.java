package org.lessons.ch6_aop.simple_aspect;

import org.lessons.ch6_aop.simple_aspect.config.ProjectConfig;
import org.lessons.ch6_aop.simple_aspect.model.Comment;
import org.lessons.ch6_aop.simple_aspect.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("SIndy");
        comment.setText("Demol comment");

        service.publishComment(comment);
    }
}
