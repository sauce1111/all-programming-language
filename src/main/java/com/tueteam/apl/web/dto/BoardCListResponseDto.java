package com.tueteam.apl.web.dto;

import com.tueteam.apl.domain.member.Member;
import com.tueteam.apl.domain.posts.Posts;
import lombok.Getter;

@Getter
public class BoardCListResponseDto {

    private Long postsIdx;
    private String title;
    private String contents;
    private Member member;

    public BoardCListResponseDto(Posts entity) {
        this.postsIdx = entity.getPostIdx();
        this.title = entity.getTitle();
        this.contents = entity.getContents();
//        this.member = entity.getWriteMemberIdx();
    }
}
