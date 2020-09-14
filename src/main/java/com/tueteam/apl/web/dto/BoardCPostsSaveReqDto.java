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
    private String contents;
    private String attachedFile;

    @Builder
    public BoardCPostsSaveReqDto(Long boardIdx, Long memberIdx, String memberName, String title,
        String contents,
        String attachedFile) {
        this.boardIdx = boardIdx;
        this.writeMemberIdx = memberIdx;
        //    this.memberName = memberName;
        this.title = title;
        this.contents = contents;
        this.attachedFile = attachedFile;
    }

    public Posts toEntity() {
        return Posts.builder()
            .boardIdx(3L)
            .memberIdx(writeMemberIdx)
            .title(title)
            .contents(contents)
            .attachedFile(attachedFile)
            .build();
    }
}
