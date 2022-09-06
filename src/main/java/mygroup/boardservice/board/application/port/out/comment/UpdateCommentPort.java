package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;

public interface UpdateCommentPort {
    void updateComment(CommentUpdateDto commentUpdateDto);
}
