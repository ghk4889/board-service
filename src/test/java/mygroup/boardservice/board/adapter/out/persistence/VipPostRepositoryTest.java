package mygroup.boardservice.board.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.domain.VipPost;
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
    void findAll(){
        vipPostMapper.findAll()
                .forEach( vipPost -> log.info(vipPost.toString()) );
    }

    @Test
    void insert() {
        VipPost vipPost = new VipPost("삽입 테스트2", "새로 삽입한 게시글의 내용2", "vipname",
                7L, Date.valueOf("2022-09-02"), Date.valueOf("2022-09-02"));
        vipPostMapper.save(vipPost);
        log.info( "insert 후 객체 id 값: " + vipPost.getId());
    }


}


