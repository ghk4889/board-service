package mygroup.boardservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CommonPost implements Post{

    private int id;
    private String title;
    private String content;
    private String writer;
    private int viewCount;
    private Date createdDate;
    private Date modifiedDate;

    private User user;

    private List<Comment> comments;

}
