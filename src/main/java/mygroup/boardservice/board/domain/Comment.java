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
public class Comment {

    private long id;
    private String content;
    private String writer;
    private Date createdDate;
    private Date modifiedDate;

    private long postId;
    private User user;
    private long commentId; //이 필드에 값이 있으면 댓글에 대한 댓글임.

    private List<Comment> replys;



}
