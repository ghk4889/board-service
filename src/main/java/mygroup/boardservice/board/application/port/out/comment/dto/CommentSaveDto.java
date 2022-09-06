package mygroup.boardservice.board.application.port.out.comment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
public class CommentSaveDto {

    private Long id; //insert가 끝나면 auto increment된 id 값이 들어간다.
    private String content;
    private String writer;
    private Date createdDate;
    private Date modifiedDate;

    private Long postId;
    private Long replyTargetId; //이 필드의 값은 어떤 댓글의 id 값임. 이 필드에 값이 있으면 지정한 댓글에 대한 댓글임.

    //insert 용
    public CommentSaveDto(String content, String writer, Date createdDate, Date modifiedDate, Long postId, Long replyTargetId) {
        this.content = content;
        this.writer = writer;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.postId = postId;
        this.replyTargetId = replyTargetId;
    }
}
