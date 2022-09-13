package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.UserForm;
import mygroup.boardservice.board.application.port.in.user.*;
import mygroup.boardservice.board.application.port.out.user.*;
import mygroup.boardservice.board.application.port.out.user.dto.UserSaveDto;
import mygroup.boardservice.board.application.port.out.user.dto.UserUpdateDto;
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
    public Long saveUser(UserSaveDto userSaveDto) {
        return saveUserPort.saveUser(userSaveDto);
    }

    @Transactional
    @Override
    public void updateUser(UserForm.Request userForm) {
        UserUpdateDto userUpdateDto = userForm.toUpdateEntity();
        updateUserPort.updateUser(userUpdateDto);
    }

    @Transactional
    @Override
    public void deleteUser(Long userId) {
        deleteUserPort.deleteUser(userId);
    }
}
