package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.domain.Comment;

public interface UpdateCommentUseCase {
    void updateComment(Comment comment);
}
