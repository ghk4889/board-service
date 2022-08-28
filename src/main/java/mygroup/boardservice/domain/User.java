package mygroup.boardservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    public enum Grade{VIP, COMMON}

    private int id;
    private String email;
    private String nickname;
    private Date createdDate;
    private Date modifiedDate;
    private Grade grade;

//    public void changeGrade(Grade grade){
//        this.grade = grade;
//    }


}
