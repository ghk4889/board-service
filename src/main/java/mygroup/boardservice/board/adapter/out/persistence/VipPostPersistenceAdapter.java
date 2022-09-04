package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.VipPostRepository;
import mygroup.boardservice.board.application.port.out.vippost.*;
import mygroup.boardservice.board.domain.VipPost;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class VipPostPersistenceAdapter implements GetSpecificVipPostPort, GetAllVipPostsPort, SaveVipPostPort
                                                    , UpdateVipPostPort, DeleteVipPostPort {

    private final VipPostRepository vipPostRepository;

    @Override
    public VipPost getVipPost(Long postId) {
        return vipPostRepository.findById(postId);
    }

    @Override
    public List<VipPost> getVipPosts() {
        return vipPostRepository.findAll();
    }

    @Override
    public void saveVipPost(VipPost vipPost) {
        vipPostRepository.save(vipPost);
    }

    @Override
    public void updateVipPost(VipPost vipPost) {
        vipPostRepository.update(vipPost);
    }

    @Override
    public void deleteVipPost(Long id) {
        vipPostRepository.delete(id);
    }
}
