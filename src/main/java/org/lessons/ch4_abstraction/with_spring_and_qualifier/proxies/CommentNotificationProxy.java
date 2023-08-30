package org.lessons.ch4_abstraction.with_spring_and_qualifier.proxies;

import org.lessons.ch4_abstraction.with_spring_and_qualifier.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
