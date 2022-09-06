package mygroup.boardservice.board.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.out.persistence.repository.VipPostRepository;
import mygroup.boardservice.board.application.port.out.vippost.*;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;
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

    @Override // 방금 삽입된 post의 id 값을 반환
    public Long saveVipPost(VipPostSaveDto vipPostSaveDto) {
        return vipPostRepository.save(vipPostSaveDto);
    }

    @Override
    public void updateVipPost(VipPostUpdateDto vipPostUpdateDto) {
        vipPostRepository.update(vipPostUpdateDto);
    }

    @Override
    public void deleteVipPost(Long id) {
        vipPostRepository.delete(id);
    }
}
