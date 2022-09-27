package mygroup.boardservice.board.adapter.out.persistence.mapper;

//namespace: mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper


import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostSearchDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    Post findById(Long postId);
    List<Post> findAll(@Param("startRow") int startRow, @Param("rowSize") int rowSize);
    List<Post> findAllDetail();
    List<Post> searchByKeyword(PostSearchDto postSearchDto);
    int getTotalRowNum();
    int getTotalRowNumForSearch(String keyword);
    void save(PostSaveDto postSaveDto);
    void update(PostUpdateDto postUpdateDto);
    void delete(Long id);

}
