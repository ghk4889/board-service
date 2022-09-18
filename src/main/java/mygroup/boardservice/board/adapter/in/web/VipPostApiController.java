//package mygroup.boardservice.board.adapter.in.web;
//
//import lombok.RequiredArgsConstructor;
//import mygroup.boardservice.board.adapter.in.web.form.VipPostForm;
//import mygroup.boardservice.board.application.port.in.vippost.*;
//import mygroup.boardservice.board.domain.VipPost;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("/api")
//@RestController
//@RequiredArgsConstructor
//public class VipPostApiController {
//    private final GetVipPostUseCase getVipPostUseCase;
//    private final DeleteVipPostUseCase deleteVipPostUseCase;
//    private final GetAllVipPostsUseCase getAllVipPostsUseCase;
//    private final SaveVipPostUseCase saveVipPostUseCase;
//    private final UpdateVipPostUseCase updateVipPostUseCase;
//
//    @GetMapping("/vipposts")    //vippost 전체 게시글 조회
//    public ResponseEntity<List<VipPost>> getVipPosts(){
//        List<VipPost> vipPosts = getAllVipPostsUseCase.getVipPosts();
//        return new ResponseEntity<>(vipPosts, HttpStatus.OK);
//    }
//
//    @GetMapping("/vipposts/{id}")    //특정 vippost 게시글 조회
//    public ResponseEntity<VipPost> getVipPost(@PathVariable Long id){
//        VipPost vipPost = getVipPostUseCase.getVipPost(id);
//        return new ResponseEntity<>(vipPost,HttpStatus.OK);
//    }
//
//    //create
//    @PostMapping("/vipposts")
//    public ResponseEntity save(@RequestBody VipPostForm.Request saveForm){
//        //삽입한 게시글의 id 값이 반환됨.
//        return ResponseEntity.ok(saveVipPostUseCase.saveVipPost(saveForm));
//    }
//
//    //update
//    @PatchMapping("/vipposts/{id}")
//    public ResponseEntity edit(@PathVariable Long id, @RequestBody VipPostForm.Request updateForm){
//        updateVipPostUseCase.updateVipPost(id, updateForm);
//        return ResponseEntity.ok(id);
//    }
//
//    //delete
//    @DeleteMapping("/vipposts/{id}")
//    public ResponseEntity delete(@PathVariable Long id){
//        deleteVipPostUseCase.deleteVipPost(id);
//        return ResponseEntity.ok(id);
//    }
//}
