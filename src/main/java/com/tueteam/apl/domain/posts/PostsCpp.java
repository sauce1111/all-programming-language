package com.tueteam.apl.domain.posts;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class PostsCpp {

  @Id
  private Long postIdx;
  private int replyCount;
  private int likeCount;
  private int dislikeCount;
  private String tag;

  public PostsCpp(Long postIdx, String tag) {
    this.postIdx = postIdx;
    this.tag = tag;
  }
}
