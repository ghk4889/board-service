package mygroup.boardservice.board.application.port.out.vippost;

import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;

public interface UpdateVipPostPort {
    void updateVipPost(VipPostUpdateDto vipPostUpdateDto);
}
