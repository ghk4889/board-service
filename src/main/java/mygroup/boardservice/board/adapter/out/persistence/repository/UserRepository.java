package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.UserMapper;
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

    public int save(User user){
        return userMapper.save(user);
    }

    public int update(User user){ return userMapper.update(user); }

    public int delete(Long id){ return userMapper.delete(id); }
}
