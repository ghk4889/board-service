package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.adapter.in.web.form.CommentForm;
import mygroup.boardservice.board.domain.PostType;

public interface SaveCommentUseCase {
    Long saveComment(CommentForm.Request commentForm, PostType postType);
}
