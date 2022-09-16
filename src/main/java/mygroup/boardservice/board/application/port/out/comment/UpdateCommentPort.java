package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.PostType;

public interface UpdateCommentPort {
    void updateComment(CommentUpdateDto commentUpdateDto, PostType postType);
}
