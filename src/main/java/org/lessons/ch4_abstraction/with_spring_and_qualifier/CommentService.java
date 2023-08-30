package org.lessons.ch4_abstraction.with_spring_and_qualifier;

import org.lessons.ch4_abstraction.with_spring_and_qualifier.model.Comment;
import org.lessons.ch4_abstraction.with_spring_and_qualifier.proxies.CommentNotificationProxy;
import org.lessons.ch4_abstraction.with_spring_and_qualifier.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
