package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipCommentMapper;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@SpringBootTest
@Slf4j
class CommentRepositoryTest {

    @Autowired
    private VipCommentMapper commentMapper;

    @Autowired
    private Map<String, CommentMapper> commentMapperMap;

    @Test
    void findById() {
        Comment comment = commentMapper.findById(2L);
        log.info(comment.toString());
        Assertions.assertThat(comment).isNotNull();
    }

    @Test
    void findAll() {
        Long postId = 2L;
        List<Comment> comments = commentMapper.findAll(postId);
        comments.forEach(comment -> log.info(comment.toString()));
        Assertions.assertThat(comments).isNotNull();
    }

    @Test
    void save() {
        CommentSaveDto commentSaveDto = new CommentSaveDto("save vip_comment Test!", "vipname", new Date(System.currentTimeMillis())
                , new Date(System.currentTimeMillis()), 3L, 0L);

        commentMapper.save(commentSaveDto);
        log.info("삽입된 comment의 id: " + commentSaveDto.getId());

        Assertions.assertThat(commentSaveDto.getId()).isNotNull();
    }

    @Test
    void update() {
        //given
        CommentUpdateDto commentUpdateDto = new CommentUpdateDto(7L, "updated vip_comment content", Date.valueOf("2022-09-07"));
        //when
        commentMapper.update(commentUpdateDto);
        //then
        Assertions.assertThat(commentMapper.findById(7L).getContent()).isEqualTo("updated vip_comment content");
    }

    @Test
    void delete() {
        //given
        CommentSaveDto commentSaveDto = new CommentSaveDto("for delete", "vipname", new Date(System.currentTimeMillis())
                , new Date(System.currentTimeMillis()), 2L, null);

        commentMapper.save(commentSaveDto);

        log.info("삭제될 comment의 id: " + commentSaveDto.getId());

        //when
        commentMapper.delete(commentSaveDto.getId());

        //then
        Assertions.assertThat(commentMapper.findById(commentSaveDto.getId())).isNull();

    }

    @Test
    void getCommentMapper(){
        String mapperName = PostType.VIP.toString().toLowerCase(Locale.ROOT) + "CommentMapper";
        Assertions.assertThat(commentMapperMap.get("xx")).isNull();
        Assertions.assertThat(commentMapperMap.get(mapperName)).isNotNull();
    }
}