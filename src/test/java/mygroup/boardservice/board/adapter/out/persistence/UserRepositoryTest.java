package mygroup.boardservice.board.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.UserMapper;
import mygroup.boardservice.board.domain.Grade;
import mygroup.boardservice.board.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;


@SpringBootTest
@Slf4j
class UserRepositoryTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findById() {
        log.info(userMapper.findById(1L).toString());
    }

    @Test
    void findAll() {
        userMapper.findAll()
                .forEach(user -> log.info(user.toString()) );
    }

    @Test
    void save() {
        User user = new User("test@gmail.com", "testname"
                , new Date(System.currentTimeMillis()), Grade.VIP, "testpwd");

        userMapper.save(user);

        log.info( "insert 후 객체 id 값: " + user.getId());
    }

    @Test
    void update() {
        User userForUpdate  = new User(4L, "updatename4"
                , new Date(System.currentTimeMillis()), Grade.COMMON, "newpassword");

        userMapper.update(userForUpdate);

        Assertions.assertThat(userMapper.findById(4L).getNickname()).isEqualTo(userForUpdate.getNickname());
    }

    @Test
    void delete() {
    }
}