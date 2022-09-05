package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.domain.Comment;

public interface UpdateCommentPort {
    void updateComment(Comment comment);
}
