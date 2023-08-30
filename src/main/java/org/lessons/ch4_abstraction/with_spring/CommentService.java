package org.lessons.ch4_abstraction.with_spring;

import org.lessons.ch4_abstraction.with_spring.model.Comment;
import org.lessons.ch4_abstraction.with_spring.proxies.CommentNotificationProxy;
import org.lessons.ch4_abstraction.with_spring.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
