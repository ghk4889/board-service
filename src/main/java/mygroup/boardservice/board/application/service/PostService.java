package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.PostForm;
import mygroup.boardservice.board.application.port.in.post.*;
import mygroup.boardservice.board.application.port.out.post.*;
import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostSearchDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import mygroup.boardservice.common.Pagination;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService implements GetAllPostsDetailUseCase, GetSpecificPostUseCase, SavePostUseCase
                            , UpdatePostUseCase, DeletePostUseCase, GetAllPostsUseCase
                            , GetTotalPostRowNumUseCase, SearchPostsUseCase {

    private final GetAllPostsDetailPort getAllPostsDetailPort;
    private final GetSpecificPostPort getSpecificPostPort;
    private final SavePostPort savePostPort;
    private final UpdatePostPort updatePostPort;
    private final DeletePostPort deletePostPort;
    private final GetAllPostsPort getAllPostsPort;
    private final GetTotalPostRowNumPort getTotalPostRowNumPort;
    private final SearchPostsPort searchPostsPort;


    @Override
    public Post getPost(Long postId, PostType postType) {
        return getSpecificPostPort.getPost(postId, postType);
    }

    @Override
    public List<Post> getPosts(Pagination pagination, PostType postType) {
        return getAllPostsPort.getPosts(pagination.getStartRow(), pagination.getRowSize(), postType);
    }

    @Override
    public List<Post> getDetailPosts(PostType postType) {
        return getAllPostsDetailPort.getDetailPosts(postType);
    }

    @Override
    public List<Post> searchPosts(String keyword, Pagination pg, PostType postType) {
        return searchPostsPort.searchPosts(new PostSearchDto(keyword, pg.getStartRow(), pg.getRowSize()), postType);
    }

    @Transactional
    @Override
    public Long savePost(PostForm.Request postForm, PostType postType) {
        PostSaveDto postSaveDto = postForm.toSaveEntity();
        return savePostPort.savePost(postSaveDto, postType);
    }

    @Transactional
    @Override
    public void updatePost(Long id, PostForm.Request postForm, PostType postType) {
        PostUpdateDto postUpdateDto = postForm.toUpdateEntity(id);
        updatePostPort.updatePost(postUpdateDto, postType);
    }

    @Transactional
    @Override
    public void deletePost(Long id, PostType postType) {
        deletePostPort.deletePost(id, postType);
    }


    @Override
    public int getTotalRowNum(PostType postType) {
        return getTotalPostRowNumPort.getTotalRowNum(postType);
    }

    @Override
    public int getTotalRowNumForSearch(PostType postType, String keyword) {
        return getTotalPostRowNumPort.getTotalRowNumForSearch(postType, keyword);
    }


}
