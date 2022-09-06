package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;

public interface UpdateVipPostUseCase {
    void updateVipPost(VipPostUpdateDto vipPostUpdateDto);
}
