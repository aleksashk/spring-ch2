package org.lessons.ch4_abstraction.with_spring_and_qualifier.repositories;

import org.lessons.ch4_abstraction.with_spring_and_qualifier.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
