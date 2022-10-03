//package mygroup.boardservice.board.adapter.out.persistence.repository;
//
//import lombok.RequiredArgsConstructor;
//import mygroup.boardservice.board.adapter.out.persistence.mapper.VipPostMapper;
//import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostSaveDto;
//import mygroup.boardservice.board.application.port.out.vippost.dto.VipPostUpdateDto;
//import mygroup.boardservice.board.domain.Post;
//import mygroup.boardservice.board.domain.VipPost;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@Repository
//public class VipPostRepository {
//
//    private final VipPostMapper vipPostMapper;
//
//    public VipPost findById(Long postId){
////        return vipPostMapper.findById(postId);
//    }
//
//    public List<VipPost> findAll(){
//        return vipPostMapper.findAll();
//    }
//
//    public Long save(VipPostSaveDto vipPostSaveDto){
//        vipPostMapper.save(vipPostSaveDto);
//        return vipPostSaveDto.getId(); // 삽입된 post의 id 값을 반환
//    }
//
//    public void update(VipPostUpdateDto vipPostUpdateDto){
//        vipPostMapper.update(vipPostUpdateDto);
//    }
//
//    public void delete(Long id){
//        vipPostMapper.delete(id);
//    }
//
//}
