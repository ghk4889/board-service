package mygroup.boardservice.board.adapter.in.web;


import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.CommentForm;
import mygroup.boardservice.board.application.port.in.comment.*;
import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class CommentApiController {
    private final DeleteCommentUseCase deleteCommentUseCase;
    private final GetAllCommentUseCase getAllCommentUseCase;
    private final GetSpecificCommentUseCase getSpecificCommentUseCase;
    private final SaveCommentUseCase saveCommentUseCase;
    private final UpdateCommentUseCase updateCommentUseCase;

    @GetMapping("/vipposts/{pid}/comments/{cid}")
    public ResponseEntity<Comment> readOne(@PathVariable Long cid){
        Comment comment = getSpecificCommentUseCase.getComment(cid, PostType.VIP);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @GetMapping("/vipposts/{pid}/comments")
    public ResponseEntity<List<Comment>> readAll(@PathVariable Long pid){
        List<Comment> comments = getAllCommentUseCase.getComments(pid, PostType.VIP);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @PostMapping("/vipposts/{pid}/comments")
    public ResponseEntity save(@PathVariable Long pid, @RequestBody CommentForm.Request commentForm){
        Long cid = saveCommentUseCase.saveComment(commentForm, PostType.VIP);
        return ResponseEntity.ok(cid);
    }


}
