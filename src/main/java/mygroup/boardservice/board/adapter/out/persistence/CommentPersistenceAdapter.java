package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.CommentRepository;
import mygroup.boardservice.board.application.port.out.comment.*;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
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
    public List<Comment> getComments(Long postId) {
        return commentRepository.findAll(postId);
    }

    @Override
    public Long saveComment(CommentSaveDto commentSaveDto) {
        return commentRepository.save(commentSaveDto);
    }

    @Override
    public void updateComment(CommentUpdateDto commentUpdateDto) {
        commentRepository.update(commentUpdateDto);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.delete(commentId);
    }
}
