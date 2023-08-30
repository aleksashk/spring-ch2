package org.lessons.ch4_abstraction.whithout_spring.repositories;

import org.lessons.ch4_abstraction.whithout_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
