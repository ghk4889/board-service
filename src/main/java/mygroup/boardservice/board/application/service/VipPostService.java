package mygroup.boardservice.board.application.service;

import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.VipPostForm;
import mygroup.boardservice.board.application.port.in.vippost.*;
import mygroup.boardservice.board.application.port.out.vippost.*;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;
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
    public Long saveVipPost(VipPostForm.Request saveForm) {
        VipPostSaveDto vipPostSaveDto = saveForm.toSaveEntity();
        return saveVipPostPort.saveVipPost(vipPostSaveDto);
    }

    @Transactional
    @Override
    public void updateVipPost(VipPostUpdateDto vipPostUpdateDto) {
        updateVipPostPort.updateVipPost(vipPostUpdateDto);
    }

    @Transactional
    @Override
    public void deleteVipPost(Long id) {
        deleteVipPostPort.deleteVipPost(id);
    }
}
