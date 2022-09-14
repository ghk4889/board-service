package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.application.port.in.comment.*;
import mygroup.boardservice.board.application.port.out.comment.*;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService implements DeleteCommentUseCase, GetAllCommentUseCase, SaveCommentUseCase
        , UpdateCommentUseCase, GetSpecificCommentUseCase {

    private final DeleteCommentPort deleteCommentPort;
    private final GetAllCommentPort getAllCommentPort;
    private final GetSpecificCommentPort getSpecificCommentPort;
    private final SaveCommentPort saveCommentPort;
    private final UpdateCommentPort updateCommentPort;

    @Override
    public Comment getComment(Long commentId) {
        return getSpecificCommentPort.getComment(commentId);
    }

    @Override
    public List<Comment> getComments(Long postId) {
        return getAllCommentPort.getComments(postId);
    }

    @Transactional
    @Override
    public Long saveComment(CommentSaveDto commentSaveDto) {
        return saveCommentPort.saveComment(commentSaveDto);
    }

    @Transactional
    @Override
    public void updateComment(CommentUpdateDto commentUpdateDto) {
        updateCommentPort.updateComment(commentUpdateDto);
    }

    @Transactional
    @Override
    public void deleteComment(Long commentId) {
        deleteCommentPort.deleteComment(commentId);
    }
}
