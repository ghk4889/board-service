package mygroup.boardservice.board.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.domain.Grade;
import mygroup.boardservice.board.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
@Slf4j
class VipPostRepositoryTest {

    @Autowired
    private VipPostMapper vipPostMapper;

    @Test
    void findById() {
        log.info(vipPostMapper.findById(2L).toString());
        //마이바티스 typeHandler 사용 -> 블로그에 포스팅할 것
    }

    @Test
    void user(){
        User user = new User(1L, "a@naver.com", "nick",
                new Date(20220325L), new Date(20220325L), Grade.VIP);

        log.info(Grade.VIP.name());
    }
}