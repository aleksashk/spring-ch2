package org.lessons.ch4_abstraction.with_spring.repositories;

import org.lessons.ch4_abstraction.with_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
