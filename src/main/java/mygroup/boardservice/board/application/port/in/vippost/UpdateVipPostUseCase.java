package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.adapter.in.web.form.VipPostForm;

public interface UpdateVipPostUseCase {
    void updateVipPost(Long id, VipPostForm.Request updateForm);
}
