package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CommentRepository {
    private final CommentMapper commentMapper;

    public Comment findById(Long commentId){
        return commentMapper.findById(commentId);
    }

    public List<Comment> findAll(Long postId){
        return commentMapper.findAll(postId);
    }

    public Long save(CommentSaveDto commentSaveDto){
        commentMapper.save(commentSaveDto);
        return commentSaveDto.getId();
    }

    public void update(CommentUpdateDto commentUpdateDto){ commentMapper.update(commentUpdateDto); }

    public void delete(Long id){ commentMapper.delete(id); }
}
