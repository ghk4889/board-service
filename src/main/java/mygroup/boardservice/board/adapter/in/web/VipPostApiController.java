package mygroup.boardservice.board.adapter.in.web;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.application.port.in.vippost.*;
import mygroup.boardservice.board.domain.VipPost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VipPostApiController {
    private final GetVipPostUseCase getVipPostUseCase;
    private final DeleteVipPostUseCase deleteVipPostUseCase;
    private final GetAllVipPostsUseCase getAllVipPostsUseCase;
    private final SaveVipPostUseCase saveVipPostUseCase;
    private final UpdateVipPostUseCase updateVipPostUseCase;

    @GetMapping("/api/vipposts")    //vippost 전체 게시글 조회
    public ResponseEntity<List<VipPost>> getVipPosts(){
        List<VipPost> vipPosts = getAllVipPostsUseCase.getVipPosts();
        return new ResponseEntity<>(vipPosts, HttpStatus.OK);
    }


}
