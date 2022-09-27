package mygroup.boardservice.board.application.port.in.post;

import mygroup.boardservice.board.domain.PostType;

public interface GetTotalPostRowNumUseCase {
    int getTotalRowNum(PostType postType);
    int getTotalRowNumForSearch(PostType postType, String keyword);
}
