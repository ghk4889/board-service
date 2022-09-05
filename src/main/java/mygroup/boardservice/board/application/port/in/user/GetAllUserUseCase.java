package mygroup.boardservice.board.application.port.in.user;

import mygroup.boardservice.board.domain.User;

import java.util.List;

public interface GetAllUserUseCase {
    List<User> getUsers();
}
