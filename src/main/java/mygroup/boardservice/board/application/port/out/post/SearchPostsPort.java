package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.application.port.out.post.dto.PostSearchDto;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;

import java.util.List;

public interface SearchPostsPort {
    List<Post> searchPosts(PostSearchDto postSearchDto, PostType postType);
}
