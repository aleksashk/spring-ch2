package org.lessons.ch4_abstraction.whithout_spring.proxies;

import org.lessons.ch4_abstraction.whithout_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
