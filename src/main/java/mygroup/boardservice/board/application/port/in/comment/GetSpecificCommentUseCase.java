package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.domain.Comment;

public interface GetSpecificCommentUseCase {
    Comment getComment(Long commentId);
}
