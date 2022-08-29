package mygroup.boardservice.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.domain.VipPost;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class VipPostRepository {

    private final VipPostMapper vipPostMapper;

    public VipPost findById(Long postId){
        return vipPostMapper.findById(postId);
    }


}
