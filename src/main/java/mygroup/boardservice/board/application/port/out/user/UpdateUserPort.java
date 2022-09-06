package mygroup.boardservice.board.application.port.out.user;

import mygroup.boardservice.board.application.port.out.vippost.dto.UserUpdateDto;
import mygroup.boardservice.board.domain.User;

public interface UpdateUserPort {
    void updateUser(UserUpdateDto userUpdateDto);
}
