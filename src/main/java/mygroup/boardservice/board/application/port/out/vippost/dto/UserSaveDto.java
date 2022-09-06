package mygroup.boardservice.board.application.port.out.vippost.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import mygroup.boardservice.board.domain.Grade;

import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
public class UserSaveDto {

    private Long id; //insert가 끝나면 auto increment된 id 값이 들어간다.
    private String email;
    private String nickname;
    private Date createdDate;
    private Grade grade;

    private String password;

    //insert용 (신규 유저 생성)
    public UserSaveDto(String email, String nickname, Date createdDate, Grade grade, String password) {
        this.email = email;
        this.nickname = nickname;
        this.createdDate = createdDate;
        this.grade = grade;
        this.password = password;
    }

}
