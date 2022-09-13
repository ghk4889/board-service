package mygroup.boardservice.board.adapter.in.web.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mygroup.boardservice.board.application.port.out.user.dto.UserSaveDto;
import mygroup.boardservice.board.application.port.out.user.dto.UserUpdateDto;
import mygroup.boardservice.board.domain.Grade;
import mygroup.boardservice.board.domain.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.sql.Date;

public class UserForm {

    /** 회원 Service 요청(Request) DTO 클래스 */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request {

        private Long id;

        @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{4,20}$", message = "아이디는 특수문자를 제외한 4~20자리여야 합니다.")
        @NotBlank(message = "아이디는 필수 입력 값입니다.")
        private String username;

        @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
        private String password;

        @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{2,10}$", message = "닉네임은 특수문자를 제외한 2~10자리여야 합니다.")
        @NotBlank(message = "닉네임은 필수 입력 값입니다.")
        private String nickname;

        @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", message = "이메일 형식이 올바르지 않습니다.")
        @NotBlank(message = "이메일은 필수 입력 값입니다.")
        private String email;

        private Grade grade;

        /* DTO -> Entity */
        public UserSaveDto toSaveEntity() {
            return new UserSaveDto(email, nickname, new Date(System.currentTimeMillis()), grade, password);
        }

        /* DTO -> Entity */
        public UserUpdateDto toUpdateEntity() {
            return new UserUpdateDto(id, nickname, new Date(System.currentTimeMillis()), grade, password);
        }
    }
}


