package org.lessons.ch4_abstraction.with_spring_and_primary.repositories;

import org.lessons.ch4_abstraction.with_spring_and_primary.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
