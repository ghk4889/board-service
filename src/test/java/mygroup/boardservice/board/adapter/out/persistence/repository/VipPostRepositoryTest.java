package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;
import mygroup.boardservice.board.domain.VipPost;
import org.assertj.core.api.Assertions;
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
        VipPostSaveDto vipPostSaveDto = new VipPostSaveDto("viewCount is int 테스트", "viewCount 수정했음."
                , "vipname", 0, Date.valueOf("2022-09-07"), Date.valueOf("2022-09-07"));
        vipPostMapper.save(vipPostSaveDto);
        log.info( "insert 후 객체 id 값: " + vipPostSaveDto.getId());
    }

    @Test
    void update() {
        //given
        VipPost vipPost = vipPostMapper.findById(6L);
        log.info(vipPost.toString());
        VipPostUpdateDto updateForm = new VipPostUpdateDto(vipPost.getId(), "update dto title"
                                , "update dto content", Date.valueOf("2022-09-09"));

        //when
        vipPostMapper.update(updateForm);

        //then
        log.info(vipPostMapper.findById(6L).toString());
    }

    @Test
    void delete() {
        //given
        VipPostSaveDto vipPostSaveDto = new VipPostSaveDto("삭제용 테스트", "삭제할 게시글의 내용", "vipname",
                0, Date.valueOf("2022-09-02"), Date.valueOf("2022-09-02"));
        vipPostMapper.save(vipPostSaveDto);

        log.info("" + vipPostSaveDto.getId());

        //when
        vipPostMapper.delete(vipPostSaveDto.getId());

        //then
        Assertions.assertThat(vipPostMapper.findById(vipPostSaveDto.getId())).isEqualTo(null);
    }

}


