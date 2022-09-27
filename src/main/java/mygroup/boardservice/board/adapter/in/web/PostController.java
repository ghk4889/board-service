package mygroup.boardservice.board.adapter.in.web;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mygroup.boardservice.board.application.port.in.post.*;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.PostType;
import mygroup.boardservice.common.Pagination;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Locale;


@Controller
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final GetAllPostsUseCase getAllPostsUseCase;
    private final GetTotalPostRowNumUseCase getTotalPostRowNumUseCase;
    private final SearchPostsUseCase searchPostsUseCase;
    private final GetSpecificPostUseCase getSpecificPostUseCase;

    @GetMapping("/")
    public String index(Model model){

        // totalRowCnt는 index.html에서 필요 없으므로 임의의 수를 줬다.
        List<Post> vipposts = getAllPostsUseCase
                .getPosts(new Pagination(5,1, 1), PostType.VIP);

        //List<Post> commonposts = getAllPostsUseCase.getPosts(new Pagination(5,1, 1), PostType.COMMON);

        model.addAttribute("vipposts", vipposts);

        return "index";
    }


    //게시글 목록 페이지
    @GetMapping("/{postType}posts")
    public String posts(@PathVariable PostType postType, Model model
                    , @RequestParam(defaultValue = "1") int currentPageNum){

        Pagination pagination = new Pagination(currentPageNum, getTotalPostRowNumUseCase.getTotalRowNum(postType));
        List<Post> posts = getAllPostsUseCase.getPosts(pagination, postType);
        model.addAttribute("posts", posts);
        model.addAttribute("pagination", pagination);
        return "posts/"+postType.name().toLowerCase(Locale.ROOT)+"posts";
    }

    //게시글 상세 페이지
    @GetMapping("/{postType}posts/{id}")
    public String post(@PathVariable PostType postType, Model model, @PathVariable long id){
        Post post = getSpecificPostUseCase.getPost(id, postType);
        model.addAttribute("post", post);
        return "posts/post";
    }

    //게시글 수정 폼 페이지
    @GetMapping("/{postType}posts/{id}/edit")
    public String editForm(@PathVariable PostType postType, Model model, @PathVariable long id){
        Post post = getSpecificPostUseCase.getPost(id, postType);
        model.addAttribute("post", post);
        model.addAttribute("postType", (postType.name().toLowerCase(Locale.ROOT)));
        return "posts/editPost";
    }

    //게시글 등록 폼 페이지
    @GetMapping("/{postType}posts/new")
    public String addForm(@PathVariable PostType postType, Model model){
        model.addAttribute("postType", (postType.name().toLowerCase(Locale.ROOT)));
        return "posts/addPost";
    }

    //검색
    @GetMapping("/{postType}posts/search")
    public String search(@PathVariable PostType postType, @RequestParam String keyword
            ,  Model model, @RequestParam(defaultValue = "1") int currentPageNum){
        Pagination pagination = new Pagination(currentPageNum
                    , getTotalPostRowNumUseCase.getTotalRowNumForSearch(postType, keyword));
        List<Post> posts = searchPostsUseCase.searchPosts(keyword, pagination, postType);
        model.addAttribute("posts", posts);
        model.addAttribute("pagination", pagination);
        model.addAttribute("keyword", keyword);

        return "posts/"+postType.name().toLowerCase(Locale.ROOT)+"posts";
    }


}
