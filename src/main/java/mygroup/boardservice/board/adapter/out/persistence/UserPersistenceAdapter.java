package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.UserRepository;
import mygroup.boardservice.board.application.port.out.user.*;
import mygroup.boardservice.board.application.port.out.user.dto.UserSaveDto;
import mygroup.boardservice.board.application.port.out.user.dto.UserUpdateDto;
import mygroup.boardservice.board.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements GetAllUserPort, GetSpecificUserPort, SaveUserPort
                                        , UpdateUserPort, DeleteUserPort {

    private final UserRepository userRepository;

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Long saveUser(UserSaveDto userSaveDto) {
        return userRepository.save(userSaveDto);
    }

    @Override
    public void updateUser(UserUpdateDto userUpdateDto) {
        userRepository.update(userUpdateDto);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.delete(userId);
    }
}
