package mygroup.boardservice.board.adapter.out.persistence.mapper;


import mygroup.boardservice.board.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User findById(Long userId);
    List<User> findAll();
    int save(User user);
    int update(User user);
    int delete(Long id);
}
