package org.lessons.ch4_abstraction.with_spring.proxies;

import org.lessons.ch4_abstraction.with_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
