package com.tueteam.apl.domain.posts;//package com.tueteam.alc.domain.posts;

import com.tueteam.apl.web.dto.BoardCListResponseDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostsRepository extends JpaRepository<Posts, Long> {
//
//    @Query("SELECT p.posts_idx, p.title, p.contents, m.member_name FROM Posts p "
//        + "LEFT JOIN Member m ON p.write_member_idx = m.member_idx"
//        + "WHERE p.board_idx = 3"
//        + "ORDER BY p.posts_idx DESC")
//    List<BoardCListResponseDto> findByboardCAlDesc();
}
