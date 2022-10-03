package mygroup.boardservice.board.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.adapter.out.persistence.repository.PostRepository;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PostPersistenceAdapterTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    void getPost() {
        Post post = postRepository.findById(2L, PostType.VIP);
        Assertions.assertThat(post).isNotNull();
        log.info(post.toString());
    }

    @Test
    void getPosts() {
        postRepository.findAll(0, 4, PostType.VIP)
                .forEach(post -> log.info(post.toString()));


    }

    @Test
    void savePost() {
    }

    @Test
    void updatePost() {
    }

    @Test
    void deletePost() {
    }
}