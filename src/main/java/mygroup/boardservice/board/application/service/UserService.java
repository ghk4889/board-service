package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.application.port.in.user.*;
import mygroup.boardservice.board.application.port.out.user.*;
import mygroup.boardservice.board.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService implements DeleteUserUseCase, GetAllUserUseCase, GetSpecificUserUseCase
        , SaveUserUseCase, UpdateUserUseCase {

    private final GetSpecificUserPort getSpecificUserPort;
    private final GetAllUserPort getAllUserPort;
    private final SaveUserPort saveUserPort;
    private final UpdateUserPort updateUserPort;
    private final DeleteUserPort deleteUserPort;

    @Override
    public User getUser(Long userId) {
        return getSpecificUserPort.getUser(userId);
    }

    @Override
    public List<User> getUsers() {
        return getAllUserPort.getUsers();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        saveUserPort.saveUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        updateUserPort.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long userId) {
        deleteUserPort.deleteUser(userId);
    }
}
