package com.tueteam.apl.web;

import com.tueteam.apl.service.PostsService;
import com.tueteam.apl.web.dto.BoardCPostsSaveReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardCController {

    private final PostsService postsService;

    @PostMapping("/api/v1/board/c")
    public Long save(@RequestBody BoardCPostsSaveReqDto reqDto) {
        return postsService.boardCPostsSave(reqDto);
    }

}