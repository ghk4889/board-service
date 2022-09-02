package mygroup.boardservice.board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CommonPost implements Post{

    private long id;
    private String title;
    private String content;
    private String writer;
    private long viewCount;
    private Date createdDate;
    private Date modifiedDate;

    private User user;

    private List<Comment> comments;

}
