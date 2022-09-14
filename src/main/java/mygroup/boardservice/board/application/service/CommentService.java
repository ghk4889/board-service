package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.CommentForm;
import mygroup.boardservice.board.application.port.in.comment.*;
import mygroup.boardservice.board.application.port.out.comment.*;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;
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
    public Comment getComment(Long commentId, PostType postType) {
        return getSpecificCommentPort.getComment(commentId, postType);
    }

    @Override
    public List<Comment> getComments(Long postId, PostType postType) {
        return getAllCommentPort.getComments(postId, postType);
    }

    @Transactional
    @Override
    public Long saveComment(CommentForm.Request commentForm, PostType postType) {
        CommentSaveDto commentSaveDto = commentForm.toSaveEntity();
        return saveCommentPort.saveComment(commentSaveDto, postType);
    }

    @Transactional
    @Override
    public void updateComment(CommentUpdateDto commentUpdateDto, PostType postType) {
        updateCommentPort.updateComment(commentUpdateDto, postType);
    }

    @Transactional
    @Override
    public void deleteComment(Long commentId, PostType postType) {
        deleteCommentPort.deleteComment(commentId, postType);
    }
}
