package mygroup.boardservice.board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
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

//    public void changeGrade(Grade grade){
//        this.grade = grade;
//    }


}
