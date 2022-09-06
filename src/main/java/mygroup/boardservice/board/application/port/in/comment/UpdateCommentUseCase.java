package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;

public interface UpdateCommentUseCase {
    void updateComment(CommentUpdateDto commentUpdateDto);
}
