package mygroup.boardservice.board.application.port.out.comment;

import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;

import java.util.List;

public interface GetAllCommentPort {
    List<Comment> getComments(Long postId, PostType postType);
}
