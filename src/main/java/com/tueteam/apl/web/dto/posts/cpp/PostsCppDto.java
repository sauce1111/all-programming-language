package com.tueteam.apl.web.dto.posts.cpp;

import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class PostsCppDto {

  private Long postIdx;
  private String title;
  private String contents;
  private String attachedFile;
  private int hits;
  private LocalDateTime createdDate;

  private int replyCount;
  private int likeCount;
  private int dislikeCount;
  private String tag;

  private Long memberIdx;
  private String memberName;

  @QueryProjection
  public PostsCppDto(Long postIdx, String title, String contents, String attachedFile, int hits,
      LocalDateTime createdDate, int replyCount, int likeCount, int dislikeCount,
      String tag, Long memberIdx, String memberName) {
    this.postIdx = postIdx;
    this.title = title;
    this.contents = contents;
    this.attachedFile = attachedFile;
    this.hits = hits;
    this.createdDate = createdDate;
    this.replyCount = replyCount;
    this.likeCount = likeCount;
    this.dislikeCount = dislikeCount;
    this.tag = tag;
    this.memberIdx = memberIdx;
    this.memberName = memberName;
  }
}
