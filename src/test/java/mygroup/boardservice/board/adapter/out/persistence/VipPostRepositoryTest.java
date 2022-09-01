package mygroup.boardservice.board.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.domain.Comment;
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
        log.info(vipPostMapper.findById(3L).toString());
    }

    @Test
    void findAll() throws Exception{
        vipPostMapper.findAll().stream()
                .forEach(vipPost -> {
                    log.info(vipPost.toString());
                });
    }


}


