package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.CommentRepository;
import mygroup.boardservice.board.application.port.out.comment.*;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CommentPersistenceAdapter implements DeleteCommentPort, GetAllCommentPort, SaveCommentPort
        , GetSpecificCommentPort, UpdateCommentPort {

    private final CommentRepository commentRepository;


    @Override
    public Comment getComment(Long commentId, PostType postType) {
        return commentRepository.findById(commentId, postType);
    }

    @Override
    public List<Comment> getComments(Long postId, PostType postType) {
        return commentRepository.findAll(postId, postType);
    }

    @Override
    public Long saveComment(CommentSaveDto commentSaveDto, PostType postType) {
        return commentRepository.save(commentSaveDto, postType);
    }

    @Override
    public void updateComment(CommentUpdateDto commentUpdateDto, PostType postType) {
        commentRepository.update(commentUpdateDto, postType);
    }

    @Override
    public void deleteComment(Long commentId, PostType postType) {
        commentRepository.delete(commentId, postType);
    }
}
