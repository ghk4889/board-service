package mygroup.boardservice.board.application.port.in.user;

import mygroup.boardservice.board.domain.User;

public interface UpdateUserUseCase {
    void updateUser(User user);
}
