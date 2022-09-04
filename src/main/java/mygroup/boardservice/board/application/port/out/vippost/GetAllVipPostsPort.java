package mygroup.boardservice.board.application.port.out.vippost;

import mygroup.boardservice.board.domain.VipPost;

import java.util.List;

public interface GetAllVipPostsPort {
    List<VipPost> getVipPosts();
}
