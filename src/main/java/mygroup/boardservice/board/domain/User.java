package mygroup.boardservice.board.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;


@NoArgsConstructor
@Getter
@ToString
public class User {

    private Long id;
    private String email;
    private String nickname;
    private Date createdDate;
    private Date modifiedDate;
    private Grade grade;
    private String password;

    //조회(select) 결과가 매핑되는 User 객체
    public User(Long id, String email, String nickname, Date createdDate, Date modifiedDate, Grade grade) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.grade = grade;
    }


//    public void changeGrade(Grade grade){
//        this.grade = grade;
//    }


}
