package mygroup.boardservice.board.adapter.in.web.form;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mygroup.boardservice.board.application.port.out.post.dto.PostSaveDto;
import mygroup.boardservice.board.application.port.out.post.dto.PostUpdateDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;

import java.sql.Date;

/**
 * request, response DTO 클래스를 하나로 묶어 InnerStaticClass로 한 번에 관리
 */
public class PostForm {

    /** 게시글의 등록과 수정을 처리할 요청(Request) 클래스 */

//    @Builder
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Request {

        private Long id;
        private String title;
        private String writer;
        private String content;

        /* Dto -> Entity */
        public PostSaveDto toSaveEntity() {
            return new PostSaveDto(title, content, writer, 0
                    , new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
        }
        /* Dto -> Entity */
        public PostUpdateDto toUpdateEntity(Long id){
            this.id = id;
            return new PostUpdateDto(id, title, content, new Date(System.currentTimeMillis()));
        }
    }



}
