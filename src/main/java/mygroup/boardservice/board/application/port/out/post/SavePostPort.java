package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.domain.PostType;

public interface SavePostPort {
    Long savePost(PostSaveDto postSaveDto, PostType postType); // 방금 삽입된 post의 id 값을 반환
}
