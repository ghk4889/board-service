package mygroup.boardservice.board.application.port.out.post.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PostSearchDto {
    String keyword;
    int startRow, rowSize;

}
