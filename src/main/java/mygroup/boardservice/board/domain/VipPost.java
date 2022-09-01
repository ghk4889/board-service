package mygroup.boardservice.board.domain;

import lombok.*;

import java.sql.Date;
import java.util.List;

//@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class VipPost implements Post{

    private Long id;
    private String title;
    private String content;
    private String writer;
    private Long viewCount;
    private Date createdDate;
    private Date modifiedDate;

    private User user;

    @Setter
    private List<Comment> comments;

    public VipPost(Long id, String title, String content, String writer, Long viewCount, Date createdDate,
                   Date modifiedDate, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.viewCount = viewCount;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.user = user;
    }

}
