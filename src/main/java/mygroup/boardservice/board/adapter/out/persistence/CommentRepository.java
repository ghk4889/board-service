package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
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

    public List<Comment> findAll(){
        return commentMapper.findAll();
    }

    public int save(Comment comment){
        return commentMapper.save(comment);
    }

    public int update(Comment comment){ return commentMapper.update(comment); }

    public int delete(Long id){ return commentMapper.delete(id); }
}
