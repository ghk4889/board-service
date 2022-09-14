package mygroup.boardservice.board.adapter.out.persistence.mapper;

import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    Comment findById(Long id);
    List<Comment> findAll(Long postId);
    void save(CommentSaveDto commentSaveDto);
    void update(CommentUpdateDto commentUpdateDto);
    void delete(Long id);
}
