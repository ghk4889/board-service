package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.PostRepository;
import mygroup.boardservice.board.application.port.out.post.*;
import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostSearchDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PostPersistenceAdapter implements GetSpecificPostPort, GetAllPostsDetailPort, SavePostPort
                                                    , UpdatePostPort, DeletePostPort, GetAllPostsPort
                                                    , GetTotalPostRowNumPort, SearchPostsPort {

    private final PostRepository postRepository;

    @Override
    public List<Post> getPosts(int startRow, int rowSize, PostType postType) {
        return postRepository.findAll(startRow, rowSize, postType);
    }

    @Override
    public Post getPost(Long postId, PostType postType) {
        return postRepository.findById(postId, postType);
    }

    @Override
    public List<Post> getDetailPosts(PostType postType) {
        return postRepository.findAllDetail(postType);
    }

    @Override
    public List<Post> searchPosts(PostSearchDto postSearchDto, PostType postType) {
        return postRepository.searchByKeyword(postSearchDto, postType);
    }

    @Override
    public Long savePost(PostSaveDto postSaveDto, PostType postType) {
        return postRepository.save(postSaveDto, postType);
    }

    @Override
    public void updatePost(PostUpdateDto postUpdateDto, PostType postType) {
        postRepository.update(postUpdateDto, postType);
    }

    @Override
    public void deletePost(Long id, PostType postType) {
        postRepository.delete(id, postType);
    }


    @Override
    public int getTotalRowNum(PostType postType) {
        return postRepository.getTotalRowNum(postType);
    }

    @Override
    public int getTotalRowNumForSearch(PostType postType, String keyword) {
        return postRepository.getTotalRowNumForSearch(postType, keyword);
    }


}
