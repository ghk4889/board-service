package mygroup.boardservice.board.application.port.in.comment;

import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;

import java.util.List;

public interface GetAllCommentUseCase {
    List<Comment> getComments(Long postId, PostType postType);
}
