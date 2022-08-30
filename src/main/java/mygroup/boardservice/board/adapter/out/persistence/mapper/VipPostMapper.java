package mygroup.boardservice.board.adapter.out.persistence.mapper;

//namespace: mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper

import mygroup.boardservice.board.domain.VipPost;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VipPostMapper {

    VipPost findById(Long postId);
}
