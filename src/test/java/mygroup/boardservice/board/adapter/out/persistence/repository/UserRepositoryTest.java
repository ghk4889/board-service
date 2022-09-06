package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.UserMapper;
import mygroup.boardservice.board.application.port.out.user.dto.UserSaveDto;
import mygroup.boardservice.board.application.port.out.user.dto.UserUpdateDto;
import mygroup.boardservice.board.domain.Grade;
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
        UserSaveDto userSaveDto = new UserSaveDto("testDTO@gmail.com", "testDtoName"
                , new Date(System.currentTimeMillis()), Grade.COMMON, "testdtopwd");

        userMapper.save(userSaveDto);

        log.info( "insert 후 객체 id 값: " + userSaveDto.getId());
    }

    @Test
    void update() {
        UserUpdateDto userForUpdate  = new UserUpdateDto(4L, "updateDTOname"
                , new Date(System.currentTimeMillis()), Grade.COMMON, "newDTOpassword");

        userMapper.update(userForUpdate);

        Assertions.assertThat(userMapper.findById(4L).getNickname()).isEqualTo(userForUpdate.getNickname());
    }

    @Test
    void delete() {
        //given
        UserSaveDto userSaveDto = new UserSaveDto("forDelete@gmail.com", "beDeleted"
                , new Date(System.currentTimeMillis()), Grade.VIP, "deletepwd");

        userMapper.save(userSaveDto);
        log.info("삽입된 user의 id: " + userSaveDto.getId());

        //when
        userMapper.delete(userSaveDto.getId());


        //then
        Assertions.assertThat(userMapper.findById(userSaveDto.getId())).isNull();

    }
}