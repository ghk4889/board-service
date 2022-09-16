package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.adapter.in.web.form.CommentForm;
import mygroup.boardservice.board.domain.PostType;

public interface UpdateCommentUseCase {
    void updateComment(Long cid, CommentForm.Request commentForm, PostType postType);
}
