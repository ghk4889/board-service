package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.domain.VipPost;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class VipPostRepository {

    private final VipPostMapper vipPostMapper;

    public VipPost findById(Long postId){
        return vipPostMapper.findById(postId);
    }


}
