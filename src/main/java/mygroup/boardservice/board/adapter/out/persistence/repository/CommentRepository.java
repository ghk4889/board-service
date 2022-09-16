package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.CommentMapper;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipCommentMapper;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.Comment;
import mygroup.boardservice.board.domain.PostType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class CommentRepository {
    private final Map<String, CommentMapper> commentMapperMap;

    public Comment findById(Long commentId, PostType postType){
        CommentMapper commentMapper = getCommentMapper(postType);
        return commentMapper.findById(commentId);
    }

    public List<Comment> findAll(Long postId, PostType postType){
        CommentMapper commentMapper = getCommentMapper(postType);
        return commentMapper.findAll(postId);
    }

    public Long save(CommentSaveDto commentSaveDto, PostType postType){
        CommentMapper commentMapper = getCommentMapper(postType);
        commentMapper.save(commentSaveDto);
        return commentSaveDto.getId();
    }

    public void update(CommentUpdateDto commentUpdateDto, PostType postType){
        CommentMapper commentMapper = getCommentMapper(postType);
        commentMapper.update(commentUpdateDto);
    }

    public void delete(Long id, PostType postType){
        CommentMapper commentMapper = getCommentMapper(postType);
        commentMapper.delete(id);
    }

    private CommentMapper getCommentMapper(PostType postType){
        String mapperName = postType.toString().toLowerCase(Locale.ROOT) + "CommentMapper";
        return commentMapperMap.get(mapperName);
    }
}
