package mygroup.boardservice.board.adapter.out.persistence.mapper;


import mygroup.boardservice.board.application.port.out.vippost.dto.UserSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.UserUpdateDto;
import mygroup.boardservice.board.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User findById(Long userId);
    List<User> findAll();
    void save(UserSaveDto userSaveDto);
    void update(UserUpdateDto userUpdateDto);
    void delete(Long id);
}
