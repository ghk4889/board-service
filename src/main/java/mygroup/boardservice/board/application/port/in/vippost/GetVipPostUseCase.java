package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.domain.VipPost;

public interface GetVipPostUseCase {
    VipPost getVipPost(Long postId);
}
