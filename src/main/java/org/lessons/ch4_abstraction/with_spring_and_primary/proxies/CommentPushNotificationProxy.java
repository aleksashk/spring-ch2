package org.lessons.ch4_abstraction.with_spring_and_primary.proxies;

import org.lessons.ch4_abstraction.with_spring_and_primary.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
