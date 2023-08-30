package org.lessons.ch4_abstraction.with_spring_and_primary.proxies;

import org.lessons.ch4_abstraction.with_spring_and_primary.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
