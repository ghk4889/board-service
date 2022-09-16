package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;

public interface GetSpecificCommentUseCase {
    Comment getComment(Long commentId, PostType postType);
}
