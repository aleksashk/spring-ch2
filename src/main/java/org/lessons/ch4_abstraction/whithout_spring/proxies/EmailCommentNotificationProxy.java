package org.lessons.ch4_abstraction.whithout_spring.proxies;

import org.lessons.ch4_abstraction.whithout_spring.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());

    }
}
