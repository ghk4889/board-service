package mygroup.boardservice.board.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
import mygroup.boardservice.board.adapter.out.persistence.mapper.UserMapper;
import mygroup.boardservice.board.domain.Comment;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}