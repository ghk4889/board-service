package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.VipPostPersistenceAdapter;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.application.port.out.vippost.*;
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
class VipPostServiceTest {

    @Autowired
    private GetAllVipPostsPort getAllVipPostsPort;
    @Autowired
    private GetSpecificVipPostPort getSpecificVipPostPort;
    @Autowired
    private SaveVipPostPort saveVipPostPort;
    @Autowired
    private UpdateVipPostPort updateVipPostPort;
    @Autowired
    private DeleteVipPostPort deleteVipPostPort;


    @Test
    void getVipPost() {
        VipPost vipPost = getSpecificVipPostPort.getVipPost(2L);
        log.info(vipPost.toString());
    }

    @Test
    void getVipPosts() {
        getAllVipPostsPort.getVipPosts().forEach(vipPost -> log.info(vipPost.toString()));
    }


    @Test
    void saveVipPost() {
        VipPostSaveDto vipPostSaveDto = new VipPostSaveDto("Service 테스트", "Service Test 내용"
                , "vipname", 7, Date.valueOf("2022-09-07"), Date.valueOf("2022-09-07"));
        saveVipPostPort.saveVipPost(vipPostSaveDto);
        log.info( "insert 후 객체 id 값: " + vipPostSaveDto.getId());
    }

    @Test
    void updateVipPost() {
        //given
        VipPost vipPost = getSpecificVipPostPort.getVipPost(6L);
        log.info(vipPost.toString());
        VipPostUpdateDto updateForm = new VipPostUpdateDto(vipPost.getId(), "update service title"
                , "update service content", Date.valueOf("2022-09-09"));

        //when
        updateVipPostPort.updateVipPost(updateForm);

        //then
        log.info(getSpecificVipPostPort.getVipPost(6L).toString());
    }

    @Test
    void deleteVipPost() {
        //given
        VipPostSaveDto vipPostSaveDto = new VipPostSaveDto("삭제용 테스트", "삭제할 게시글의 내용", "vipname",
                0, Date.valueOf("2022-09-02"), Date.valueOf("2022-09-02"));
        saveVipPostPort.saveVipPost(vipPostSaveDto);

        log.info("" + vipPostSaveDto.getId());

        //when
        deleteVipPostPort.deleteVipPost(vipPostSaveDto.getId());

        //then
        Assertions.assertThat(getSpecificVipPostPort.getVipPost(vipPostSaveDto.getId())).isEqualTo(null);
    }
}