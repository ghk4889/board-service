package mygroup.boardservice.board.application.port.out.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import mygroup.boardservice.board.domain.Grade;

import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
public class UserUpdateDto {

    private Long id;
    private String email;
    private String nickname;
    private Date modifiedDate;
    private Grade grade;
    private String password;

    //update용 (닉네임 변경, 등급 변경, 비밀번호 변경 -> 변경일 갱신)
    public UserUpdateDto(Long id, String nickname, Date modifiedDate, Grade grade, String password) {
        this.id = id;
        this.nickname = nickname;
        this.modifiedDate = modifiedDate;
        this.grade = grade;
        this.password = password;
    }
}
