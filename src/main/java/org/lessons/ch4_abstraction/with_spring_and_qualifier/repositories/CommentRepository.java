package org.lessons.ch4_abstraction.with_spring_and_qualifier.repositories;

import org.lessons.ch4_abstraction.with_spring_and_qualifier.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
