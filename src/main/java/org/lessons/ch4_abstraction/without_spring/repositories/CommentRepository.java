package org.lessons.ch4_abstraction.without_spring.repositories;

import org.lessons.ch4_abstraction.without_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
