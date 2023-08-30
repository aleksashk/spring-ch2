package org.lessons.ch4_abstraction.with_spring_and_primary.proxies;

import org.lessons.ch4_abstraction.with_spring_and_primary.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());

    }
}
