package mygroup.boardservice.board.application.port.in.post;


import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;

import java.util.List;

public interface GetAllPostsDetailUseCase {
    List<Post> getDetailPosts(PostType postType);
}
