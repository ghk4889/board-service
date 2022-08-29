package mygroup.boardservice.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.domain.VipPost;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class VipPostRepositoryTest {

    @Autowired
    private VipPostMapper vipPostMapper;

    @Test
    void findById() {
        log.info(vipPostMapper.findById(2L).toString());
    }
}