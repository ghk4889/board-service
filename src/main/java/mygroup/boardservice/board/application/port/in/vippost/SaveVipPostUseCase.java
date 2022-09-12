package mygroup.boardservice.board.application.port.in.vippost;

import mygroup.boardservice.board.adapter.in.web.form.VipPostForm;

public interface SaveVipPostUseCase {
    Long saveVipPost(VipPostForm.Request vipPostSaveDto);
}
