package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.domain.VipPost;

import java.util.List;

public interface GetAllVipPostsUseCase {
    List<VipPost> getVipPosts();
}
