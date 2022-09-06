package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;

public interface SaveCommentUseCase {
    Long saveComment(CommentSaveDto commentSaveDto);
}
