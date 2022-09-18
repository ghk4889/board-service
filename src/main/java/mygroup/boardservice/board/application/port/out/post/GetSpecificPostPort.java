package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;

public interface GetSpecificPostPort {
    Post getPost(Long postId, PostType postType);
}
