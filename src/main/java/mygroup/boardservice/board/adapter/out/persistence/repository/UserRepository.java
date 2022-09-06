package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.UserMapper;
import mygroup.boardservice.board.application.port.out.vippost.dto.UserSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.UserUpdateDto;
import mygroup.boardservice.board.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final UserMapper userMapper;

    public User findById(Long userId){
        return userMapper.findById(userId);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public Long save(UserSaveDto userSaveDto){
        userMapper.save(userSaveDto);
        return userSaveDto.getId();
    }

    public void update(UserUpdateDto userUpdateDto){ userMapper.update(userUpdateDto); }

    public void delete(Long id){ userMapper.delete(id); }
}
