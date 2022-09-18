package mygroup.boardservice.board.adapter.out.persistence.mapper;

//namespace: mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper


import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    Post findById(Long postId);
    List<Post> findAll();
    void save(PostSaveDto postSaveDto);
    void update(PostUpdateDto postUpdateDto);
    void delete(Long id);
}
