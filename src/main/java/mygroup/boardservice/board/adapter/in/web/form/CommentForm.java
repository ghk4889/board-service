package mygroup.boardservice.board.adapter.in.web.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentSaveDto;
import mygroup.boardservice.board.application.port.out.comment.dto.CommentUpdateDto;
import mygroup.boardservice.board.domain.User;
import mygroup.boardservice.board.domain.VipPost;

import java.sql.Date;

public class CommentForm {

    /** 댓글 Service 요청을 위한 DTO 클래스 */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request {
        private Long id;
        private String content;
        private String writer;
        private Date createdDate;
        private Date modifiedDate;
        private Long postId;
        private Long replyTargetId;

        private User user;
        private VipPost posts;

        /* Dto -> Entity */
        public CommentSaveDto toSaveEntity() {
            return new CommentSaveDto(content, writer, new Date(System.currentTimeMillis())
                    , new Date(System.currentTimeMillis()), postId, replyTargetId);
        }

        /* Dto -> Entity */
        public CommentUpdateDto toUpdateEntity(Long id) {
            this.id = id;
            return new CommentUpdateDto(id, content, new Date(System.currentTimeMillis()));
        }
    }
}
