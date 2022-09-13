package mygroup.boardservice.board.application.port.in.user;

import mygroup.boardservice.board.adapter.in.web.form.UserForm;

public interface UpdateUserUseCase {
    void updateUser(UserForm.Request userForm);
}
