package mygroup.boardservice.adapter.out.persistence.mapper;

//namespace: mygroup.boardservice.adapter.out.persistence.mapper.VipPostMapper

import mygroup.boardservice.domain.VipPost;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VipPostMapper {

    VipPost findById(Long postId);
}
