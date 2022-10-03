package mygroup.boardservice.board.application.port.out.post.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
public class PostUpdateDto {

    private Long id;
    private String title;
    private String content;
    private Date modifiedDate;

    //update할 때 사용됨.
    public PostUpdateDto(Long id, String title, String content, Date modifiedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.modifiedDate = modifiedDate;
    }
}
