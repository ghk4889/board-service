package mygroup.boardservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
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

// 현재 VipPost 테이블만 있기 때문에 아래 두 필드는 아직 받을 수 없다. 나중에 추가할 것.

//    private List<Comment> comments;

}
