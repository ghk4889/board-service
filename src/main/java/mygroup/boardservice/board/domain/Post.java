package mygroup.boardservice.board.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@ToString
public class Post {

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

    //select 할 때 사용됨(Detail)
    public Post(Long id, String title, String content, String writer, Long viewCount, Date createdDate,
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

    //select all 할 때 사용됨
    public Post(Long id, String title, String content, String writer, Long viewCount, Date createdDate,
                Date modifiedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.viewCount = viewCount;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
