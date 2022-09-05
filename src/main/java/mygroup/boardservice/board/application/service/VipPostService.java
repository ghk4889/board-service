package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.application.port.in.vippost.*;
import mygroup.boardservice.board.application.port.out.vippost.*;
import mygroup.boardservice.board.domain.VipPost;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VipPostService implements GetAllVipPostsUseCase, GetVipPostUseCase, SaveVipPostUseCase
                            , UpdateVipPostUseCase, DeleteVipPostUseCase {

    private final GetAllVipPostsPort getAllVipPostsPort;
    private final GetSpecificVipPostPort getSpecificVipPostPort;
    private final SaveVipPostPort saveVipPostPort;
    private final UpdateVipPostPort updateVipPostPort;
    private final DeleteVipPostPort deleteVipPostPort;

    @Override
    public VipPost getVipPost(Long postId) {
        return getSpecificVipPostPort.getVipPost(postId);
    }

    @Override
    public List<VipPost> getVipPosts() {
        return getAllVipPostsPort.getVipPosts();
    }

    @Transactional
    @Override
    public void saveVipPost(VipPost vipPost) {
        saveVipPostPort.saveVipPost(vipPost);
    }

    @Transactional
    @Override
    public void updateVipPost(VipPost vipPost) {
        updateVipPostPort.updateVipPost(vipPost);
    }

    @Transactional
    @Override
    public void deleteVipPost(Long id) {
        deleteVipPostPort.deleteVipPost(id);
    }
}
