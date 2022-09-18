package mygroup.boardservice.board.application.port.in.post;

import mygroup.boardservice.board.adapter.in.web.form.PostForm;
import mygroup.boardservice.board.domain.PostType;

public interface UpdatePostUseCase {
    void updatePost(Long id, PostForm.Request postForm, PostType postType);
}
