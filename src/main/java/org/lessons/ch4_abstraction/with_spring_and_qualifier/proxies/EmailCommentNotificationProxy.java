package org.lessons.ch4_abstraction.with_spring_and_qualifier.proxies;

import org.lessons.ch4_abstraction.with_spring_and_qualifier.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());

    }
}
