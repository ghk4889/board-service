package mygroup.boardservice.board.application.port.in.post;

import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;


public interface GetPostUseCase {
    Post getPost(Long postId, PostType postType);
}
