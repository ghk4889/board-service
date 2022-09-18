package mygroup.boardservice.board.adapter.in.web;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.application.port.in.post.GetAllPostsDetailUseCase;
import mygroup.boardservice.board.application.port.in.post.GetSpecificPostUseCase;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Locale;


@Controller
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final GetAllPostsDetailUseCase getAllPostsUseCase;
    private final GetSpecificPostUseCase getSpecificPostUseCase;

    @GetMapping("/")
    public String index(Model model){
        List<Post> vipposts = getAllPostsUseCase.getDetailPosts(PostType.VIP);
//        List<Post> commonposts = getAllPostsUseCase.getPosts(PostType.COMMON);

        model.addAttribute("vipposts", vipposts);

        return "index";
    }


    //게시글 목록 페이지
    @GetMapping("/{postType}posts")
    public String posts(@PathVariable PostType postType, Model model){
        List<Post> posts = getAllPostsUseCase.getDetailPosts(postType);
        model.addAttribute("posts", posts);
        return "posts/"+postType.name().toLowerCase(Locale.ROOT)+"posts";
    }

}
