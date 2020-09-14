package com.tueteam.apl.web.dto;

import com.tueteam.apl.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardCPostsSaveReqDto {

    private Long boardIdx;
    private Long writeMemberIdx;
    //    private String memberName;
    private String title;
    private String content;
    private String attachedFile;

    @Builder
    public BoardCPostsSaveReqDto(Long boardIdx, Long memberIdx, String memberName, String title,
        String content,
        String attachedFile) {
        this.boardIdx = boardIdx;
        this.writeMemberIdx = memberIdx;
        //    this.memberName = memberName;
        this.title = title;
        this.content = content;
        this.attachedFile = attachedFile;
    }

    public Posts toEntity() {
        return Posts.builder()
            .boardIdx(3L)
            .memberIdx(writeMemberIdx)
            .title(title)
            .contents(content)
            .attachedFile(attachedFile)
            .build();
    }
}
