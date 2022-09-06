package mygroup.boardservice.board.adapter.out.persistence.mapper;

//namespace: mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper


import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;
import mygroup.boardservice.board.domain.VipPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VipPostMapper {

    VipPost findById(Long postId);
    List<VipPost> findAll();
    void save(VipPostSaveDto vipPostSaveDto);
    void update(VipPostUpdateDto vipPostUpdateDto);
    void delete(Long id);
}
