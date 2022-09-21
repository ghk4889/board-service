package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
import mygroup.boardservice.board.adapter.out.persistence.mapper.PostMapper;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostSearchDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import mygroup.boardservice.board.domain.VipPost;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class PostRepository {

    private final Map<String, PostMapper> postMapperMap;

    public Post findById(Long postId, PostType postType){
        return getPostMapper(postType).findById(postId);
    }

    public List<Post> findAll(int startRow, int rowSize, PostType postType){
        return getPostMapper(postType).findAll(startRow, rowSize);
    }

    public List<Post> findAllDetail(PostType postType){
        return getPostMapper(postType).findAllDetail();
    }

    public List<Post> searchByKeyword(PostSearchDto postSearchDto, PostType postType){
        return getPostMapper(postType).searchByKeyword(postSearchDto);
    }

    public int getTotalRowNum(PostType postType){
        return getPostMapper(postType).getTotalRowNum();
    }

    public Long save(PostSaveDto postSaveDto, PostType postType){
        getPostMapper(postType).save(postSaveDto);
        return postSaveDto.getId(); // 삽입된 post의 id 값을 반환
    }

    public void update(PostUpdateDto postUpdateDto, PostType postType){
        getPostMapper(postType).update(postUpdateDto);
    }

    public void delete(Long id, PostType postType){
        getPostMapper(postType).delete(id);
    }

    private PostMapper getPostMapper(PostType postType){
        String mapperName = postType.toString().toLowerCase(Locale.ROOT) + "PostMapper";
        return postMapperMap.get(mapperName);
    }

}
