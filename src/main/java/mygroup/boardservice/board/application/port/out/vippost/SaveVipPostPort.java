package mygroup.boardservice.board.application.port.out.vippost;

import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;

public interface SaveVipPostPort {
    Long saveVipPost(VipPostSaveDto vipPostSaveDto); // 방금 삽입된 post의 id 값을 반환
}
