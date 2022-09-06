package mygroup.boardservice.board.application.port.out.comment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
public class CommentUpdateDto {

    private Long id;
    private String content;
    private Date modifiedDate;

    //update 용
    public CommentUpdateDto(Long id, String content, Date modifiedDate) {
        this.id = id;
        this.content = content;
        this.modifiedDate = modifiedDate;
    }
}
