package mygroup.boardservice.board.adapter.in.web;


import lombok.RequiredArgsConstructor;
import mygroup.boardservice.board.adapter.in.web.form.UserForm;
import mygroup.boardservice.board.application.port.in.user.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class UserApiController {


    private final UpdateUserUseCase updateUserUseCase;


    @PatchMapping("/user")
    public ResponseEntity<String> modify(@RequestBody UserForm.Request userForm){
        updateUserUseCase.updateUser(userForm);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
