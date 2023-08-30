package org.lessons.ch4_abstraction.with_spring_and_primary.repositories;

import org.lessons.ch4_abstraction.with_spring_and_primary.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
