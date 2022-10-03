package mygroup.boardservice.board.application.port.out.post;

import mygroup.boardservice.board.domain.PostType;

public interface GetTotalPostRowNumPort {
    int getTotalRowNum(PostType postType);
    int getTotalRowNumForSearch(PostType postType, String keyword);
}
