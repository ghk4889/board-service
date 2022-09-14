package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.PostType;

public interface UpdateCommentUseCase {
    void updateComment(CommentUpdateDto commentUpdateDto, PostType postType);
}
