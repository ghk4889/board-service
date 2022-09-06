package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
import mygroup.boardservice.board.adapter.out.persistence.mapper.UserMapper;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CommentRepositoryTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void findById() {
        Comment comment = commentMapper.findById(2L);
        log.info(comment.toString());
        Assertions.assertThat(comment).isNotNull();
    }

    @Test
    void findAll() {
        List<Comment> comments = commentMapper.findAll();
        comments.forEach(comment -> log.info(comment.toString()));
        Assertions.assertThat(comments).isNotNull();
    }

    @Test
    void save() {
        CommentSaveDto commentSaveDto = new CommentSaveDto("save DTO Test!", "vipname", new Date(System.currentTimeMillis())
                , new Date(System.currentTimeMillis()), 2L, 3L);

        commentMapper.save(commentSaveDto);
        log.info("삽입된 comment의 id: " + commentSaveDto.getId());

        Assertions.assertThat(commentSaveDto.getId()).isNotNull();
    }

    @Test
    void update() {
        //given
        CommentUpdateDto commentUpdateDto = new CommentUpdateDto(4L, "updated dto content", Date.valueOf("2022-09-07"));
        //when
        commentMapper.update(commentUpdateDto);
        //then
        Assertions.assertThat(commentMapper.findById(4L).getContent()).isEqualTo("updated dto content");
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
}