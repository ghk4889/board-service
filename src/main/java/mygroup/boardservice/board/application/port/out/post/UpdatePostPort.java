package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.domain.PostType;

public interface UpdatePostPort {
    void updatePost(PostUpdateDto postUpdateDto, PostType postType);
}
