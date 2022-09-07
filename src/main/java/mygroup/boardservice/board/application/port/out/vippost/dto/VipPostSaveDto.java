package mygroup.boardservice.board.application.port.out.vippost.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;


@NoArgsConstructor
@Getter
@ToString
public class VipPostSaveDto {

    private Long id; //insert가 끝나면 auto increment된 id 값이 들어간다.
    private String title;
    private String content;
    private String writer;
    private int viewCount;
    private Date createdDate;
    private Date modifiedDate;

    public VipPostSaveDto(String title, String content, String writer, int viewCount, Date createdDate, Date modifiedDate) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.viewCount = viewCount;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
