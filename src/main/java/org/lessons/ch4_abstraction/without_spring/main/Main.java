package org.lessons.ch4_abstraction.without_spring.main;

import org.lessons.ch4_abstraction.without_spring.model.Comment;
import org.lessons.ch4_abstraction.without_spring.proxies.EmailCommentNotificationProxy;
import org.lessons.ch4_abstraction.without_spring.repositories.DBCommentRepository;
import org.lessons.ch4_abstraction.without_spring.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publicComment(comment);

    }
}
