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

    private Long id;
    private String content;
    private String writer;
    private Date createdDate;
    private Date modifiedDate;

    private Long postId;
    private Long replyTargetId; //이 필드의 값은 어떤 댓글의 id 값임. 이 필드에 값이 있으면 지정한 댓글에 대한 댓글임.

//    private List<Comment> replys;



}
