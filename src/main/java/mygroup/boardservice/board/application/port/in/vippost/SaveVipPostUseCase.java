package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;

public interface SaveVipPostUseCase {
    Long saveVipPost(VipPostSaveDto vipPostSaveDto);
}
