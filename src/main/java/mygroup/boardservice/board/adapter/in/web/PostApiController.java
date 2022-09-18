package mygroup.boardservice.board.adapter.in.web;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.PostForm;
import mygroup.boardservice.board.application.port.in.post.*;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/{postType}posts")
@RestController
@RequiredArgsConstructor
public class PostApiController {

    private final GetSpecificPostUseCase getPostUseCase;
    private final DeletePostUseCase deletePostUseCase;
    private final GetAllPostsDetailUseCase getAllPostsUseCase;
    private final SavePostUseCase savePostUseCase;
    private final UpdatePostUseCase updatePostUseCase;

    @GetMapping     //vippost 전체 게시글 조회
    public ResponseEntity<List<Post>> getPosts(@PathVariable PostType postType){
        List<Post> posts = getAllPostsUseCase.getDetailPosts(postType);
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping("/{id}")    //특정 vippost 게시글 조회
    public ResponseEntity<Post> getPost(@PathVariable Long id, @PathVariable PostType postType){
        Post post = getPostUseCase.getPost(id, postType);
        return new ResponseEntity<>(post,HttpStatus.OK);
    }

    //create
    @PostMapping
    public ResponseEntity save(@RequestBody PostForm.Request saveForm, @PathVariable PostType postType){
        //삽입한 게시글의 id 값이 반환됨.
        return ResponseEntity.ok(savePostUseCase.savePost(saveForm, postType));
    }

    //update
    @PatchMapping("/{id}")
    public ResponseEntity edit(@PathVariable Long id, @PathVariable PostType postType,
                               @RequestBody PostForm.Request updateForm){
        updatePostUseCase.updatePost(id, updateForm, postType);
        return ResponseEntity.ok(id);
    }

    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id, @PathVariable PostType postType){
        deletePostUseCase.deletePost(id, postType);
        return ResponseEntity.ok(id);
    }
}
