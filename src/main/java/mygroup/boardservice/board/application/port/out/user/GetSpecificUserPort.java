package mygroup.boardservice.board.application.port.out.user;

import mygroup.boardservice.board.domain.User;

public interface GetSpecificUserPort {
    User getUser(Long userId);
}
