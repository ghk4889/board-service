package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.CommentRepository;
import mygroup.boardservice.board.application.port.in.comment.*;
import mygroup.boardservice.board.domain.Comment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService implements DeleteCommentUseCase, GetAllCommentUseCase, SaveCommentUseCase
        , UpdateCommentUseCase, GetSpecificCommentUseCase {

    private final CommentRepository commentRepository;

    @Override
    public Comment getComment(Long commentId) {
        return commentRepository.findById(commentId);
    }

    @Override
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    @Transactional
    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Transactional
    @Override
    public void updateComment(Comment comment) {
        commentRepository.update(comment);
    }

    @Transactional
    @Override
    public void deleteComment(Long commentId) {
        commentRepository.delete(commentId);
    }
}
