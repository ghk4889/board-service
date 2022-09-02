package mygroup.boardservice.board.domain;

import lombok.AllArgsConstructor;
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

    //insert용 (신규 유저 생성)
    public User(String email, String nickname, Date createdDate, Grade grade, String password) {
        this.email = email;
        this.nickname = nickname;
        this.createdDate = createdDate;
        this.grade = grade;
        this.password = password;
    }
    
    //update용 (닉네임 변경, 등급 변경, 비밀번호 변경 -> 변경일 갱신)
//    public User(Long id, String nickname, Date modifiedDate, Grade grade, String password) {
//        this.id = id;
//        this.nickname = nickname;
//        this.modifiedDate = modifiedDate;
//        this.grade = grade;
//        this.password = password;
//    }


//    public void changeGrade(Grade grade){
//        this.grade = grade;
//    }


}
