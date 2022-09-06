package mygroup.boardservice.board.application.port.out.vippost.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
public class VipPostUpdateDto {

    private Long id;
    private String title;
    private String content;
    private Date modifiedDate;

    //update할 때 사용됨.
    public VipPostUpdateDto(Long id, String title, String content, Date modifiedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.modifiedDate = modifiedDate;
    }
}
