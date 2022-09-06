package mygroup.boardservice.board.application.port.in.user;

import mygroup.boardservice.board.application.port.out.vippost.dto.UserSaveDto;

public interface SaveUserUseCase {
    Long saveUser(UserSaveDto userSaveDto);
}
