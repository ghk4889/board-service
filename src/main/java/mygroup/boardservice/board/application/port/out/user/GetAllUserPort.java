package mygroup.boardservice.board.application.port.out.user;

import mygroup.boardservice.board.domain.User;

import java.util.List;

public interface GetAllUserPort {
    List<User> getUsers();
}
