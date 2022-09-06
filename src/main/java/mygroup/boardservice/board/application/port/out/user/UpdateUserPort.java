package mygroup.boardservice.board.application.port.out.user;

import mygroup.boardservice.board.application.port.out.user.dto.UserUpdateDto;

public interface UpdateUserPort {
    void updateUser(UserUpdateDto userUpdateDto);
}
