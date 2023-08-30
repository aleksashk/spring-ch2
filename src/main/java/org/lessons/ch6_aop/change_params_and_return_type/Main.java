package org.lessons.ch6_aop.change_params_and_return_type;

import org.lessons.ch6_aop.change_params_and_return_type.config.ProjectConfig;
import org.lessons.ch6_aop.change_params_and_return_type.model.Comment;
import org.lessons.ch6_aop.change_params_and_return_type.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Sindy");
        comment.setText("Demo comment");

        String value = service.publishComment(comment);
        logger.info(value);
    }
}
