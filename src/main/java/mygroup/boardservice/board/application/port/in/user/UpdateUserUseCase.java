package mygroup.boardservice.board.application.port.in.user;

import mygroup.boardservice.board.application.port.out.vippost.dto.UserUpdateDto;

public interface UpdateUserUseCase {
    void updateUser(UserUpdateDto userUpdateDto);
}
