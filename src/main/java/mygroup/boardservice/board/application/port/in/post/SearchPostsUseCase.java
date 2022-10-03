package mygroup.boardservice.board.application.port.in.post;

import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import mygroup.boardservice.common.Pagination;

import java.util.List;

public interface SearchPostsUseCase {
    List<Post> searchPosts(String keyword, Pagination pagination, PostType postType);
}
