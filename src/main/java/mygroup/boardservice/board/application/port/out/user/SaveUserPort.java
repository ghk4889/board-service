package mygroup.boardservice.board.application.port.out.user;

import mygroup.boardservice.board.application.port.out.user.dto.UserSaveDto;

public interface SaveUserPort {
    Long saveUser(UserSaveDto userSaveDto);
}
