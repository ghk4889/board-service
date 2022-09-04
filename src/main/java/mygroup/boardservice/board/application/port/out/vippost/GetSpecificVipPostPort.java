package mygroup.boardservice.board.application.port.out.vippost;

import mygroup.boardservice.board.domain.VipPost;

public interface GetSpecificVipPostPort {
    VipPost getVipPost(Long postId);
}
