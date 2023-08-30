package org.lessons.ch4_abstraction.with_spring_and_primary.main;

import org.lessons.ch4_abstraction.with_spring_and_primary.CommentService;
import org.lessons.ch4_abstraction.with_spring_and_primary.configuration.ProjectConfiguration;
import org.lessons.ch4_abstraction.with_spring_and_primary.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publicComment(comment);

    }
}
