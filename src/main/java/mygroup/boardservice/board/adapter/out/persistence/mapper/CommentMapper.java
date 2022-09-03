package mygroup.boardservice.board.adapter.out.persistence.mapper;

import mygroup.boardservice.board.domain.Comment;

import java.util.List;

public interface CommentMapper {
    Comment findById(Long id);
    List<Comment> findAll();
    int save(Comment comment);
    int update(Comment comment);
    int delete(Long id);
}
