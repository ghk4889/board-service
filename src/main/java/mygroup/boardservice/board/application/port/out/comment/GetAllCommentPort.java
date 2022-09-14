package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.domain.Comment;

import java.util.List;

public interface GetAllCommentPort {
    List<Comment> getComments(Long postId);
}
