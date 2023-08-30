package org.lessons.ch6_aop.change_params_and_return_type.service;

import org.lessons.ch6_aop.change_params_and_return_type.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishcomment: " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
