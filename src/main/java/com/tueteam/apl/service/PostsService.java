package com.tueteam.apl.service;//package com.tueteam.alc.service;

import com.tueteam.apl.domain.posts.PostsRepository;
import com.tueteam.apl.web.dto.BoardCListResponseDto;
import com.tueteam.apl.web.dto.BoardCPostsSaveReqDto;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long boardCPostsSave(BoardCPostsSaveReqDto reqDto) {
        return postsRepository.save(reqDto.toEntity()).getPostIdx();
    }

//    @Transactional(readOnly = true)
//    public List<BoardCListResponseDto> findByboardCAllDesc() {
//        return postsRepository.findByboardCAlDesc().stream()
//            .map(BoardCListResponseDto::new)
//            .collect(Collectors.toList());
//    }
}
