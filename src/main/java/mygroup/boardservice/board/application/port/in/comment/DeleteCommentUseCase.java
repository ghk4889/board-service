package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.domain.PostType;

public interface DeleteCommentUseCase {
    void deleteComment(Long commentId, PostType postType);
}
