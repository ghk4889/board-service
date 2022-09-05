package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.CommentRepository;
import mygroup.boardservice.board.application.port.out.comment.*;
import mygroup.boardservice.board.domain.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CommentPersistenceAdapter implements DeleteCommentPort, GetAllCommentPort, SaveCommentPort
        , GetSpecificCommentPort, UpdateCommentPort {

    private final CommentRepository commentRepository;


    @Override
    public Comment getComment(Long commentId) {
        return commentRepository.findById(commentId);
    }

    @Override
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        commentRepository.update(comment);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.delete(commentId);
    }
}
