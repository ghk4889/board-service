package mygroup.boardservice.board.application.port.in.post;

import mygroup.boardservice.board.domain.PostType;

public interface DeletePostUseCase {
    void deletePost(Long id, PostType postType);
}
