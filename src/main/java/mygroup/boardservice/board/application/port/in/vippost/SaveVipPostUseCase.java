package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.domain.VipPost;

public interface SaveVipPostUseCase {
    void saveVipPost(VipPostSaveDto vipPostSaveDto);
}
