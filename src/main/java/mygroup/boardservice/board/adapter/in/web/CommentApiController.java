package mygroup.boardservice.board.adapter.in.web;


import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.application.port.in.comment.*;
import mygroup.boardservice.board.domain.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/posts/{pid}/comments/{cid}")
    public ResponseEntity<Comment> readOne(@PathVariable Long cid){
        Comment comment = getSpecificCommentUseCase.getComment(cid);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @GetMapping("/posts/{pid}/comments")
    public ResponseEntity<List<Comment>> readAll(@PathVariable Long pid){
        List<Comment> comments = getAllCommentUseCase.getComments(pid);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }



}
