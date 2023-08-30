package org.lessons.ch4_abstraction.without_spring.proxies;

import org.lessons.ch4_abstraction.without_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
