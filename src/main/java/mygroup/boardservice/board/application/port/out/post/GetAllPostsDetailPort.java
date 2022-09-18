package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;

import java.util.List;

public interface GetAllPostsDetailPort {
    List<Post> getDetailPosts(PostType postType);
}
