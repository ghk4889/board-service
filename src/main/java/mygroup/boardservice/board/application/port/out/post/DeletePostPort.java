package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.domain.PostType;

public interface DeletePostPort {
    void deletePost(Long id, PostType postType);
}
