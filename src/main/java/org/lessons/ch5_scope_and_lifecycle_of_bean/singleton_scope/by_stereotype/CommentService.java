package org.lessons.ch5_scope_and_lifecycle_of_bean.singleton_scope.by_stereotype;

import org.springframework.stereotype.Service;

@Service
public class CommentService {


    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return this.commentRepository;
    }
}
