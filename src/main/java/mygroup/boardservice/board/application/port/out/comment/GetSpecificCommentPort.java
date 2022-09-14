package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;

public interface GetSpecificCommentPort {
    Comment getComment(Long commentId, PostType postType);
}
