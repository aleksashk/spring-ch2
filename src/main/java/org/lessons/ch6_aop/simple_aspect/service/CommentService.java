package org.lessons.ch6_aop.simple_aspect.service;

import org.lessons.ch6_aop.simple_aspect.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishcomment: " + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
