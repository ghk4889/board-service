package mygroup.boardservice.board.adapter.out.persistence.repository;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
import mygroup.boardservice.board.domain.Post;
import mygroup.boardservice.board.domain.VipPost;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class VipPostRepository {

    private final VipPostMapper vipPostMapper;

    public VipPost findById(Long postId){
        return vipPostMapper.findById(postId);
    }

    public List<VipPost> findAll(){
        return vipPostMapper.findAll();
    }

    public int save(VipPost vipPost){
        return vipPostMapper.save(vipPost);
    }

    public int update(VipPost vipPost){ return vipPostMapper.update(vipPost); }

    public int delete(Long id){ return vipPostMapper.delete(id); }

}
