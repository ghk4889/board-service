package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.domain.PostType;

public interface SaveCommentPort {
    Long saveComment(CommentSaveDto commentSaveDto, PostType postType);
}
