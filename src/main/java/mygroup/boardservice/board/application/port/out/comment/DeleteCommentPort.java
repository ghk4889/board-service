package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.domain.PostType;

public interface DeleteCommentPort {
    void deleteComment(Long commentId, PostType postType);
}
