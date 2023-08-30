package org.lessons.ch4_abstraction.whithout_spring.services;

import org.lessons.ch4_abstraction.whithout_spring.model.Comment;
import org.lessons.ch4_abstraction.whithout_spring.proxies.CommentNotificationProxy;
import org.lessons.ch4_abstraction.whithout_spring.proxies.EmailCommentNotificationProxy;
import org.lessons.ch4_abstraction.whithout_spring.repositories.CommentRepository;

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
