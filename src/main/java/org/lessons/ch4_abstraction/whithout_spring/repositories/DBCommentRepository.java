package org.lessons.ch4_abstraction.whithout_spring.repositories;

import org.lessons.ch4_abstraction.whithout_spring.model.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
