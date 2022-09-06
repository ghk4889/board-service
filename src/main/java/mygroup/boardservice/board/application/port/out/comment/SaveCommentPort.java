package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;

public interface SaveCommentPort {
    Long saveComment(CommentSaveDto commentSaveDto);
}
