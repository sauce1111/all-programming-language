package com.tueteam.apl.domain.posts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class PostsJava{

  @Id
  private Long postIdx;
  private String javaCode;

  public PostsJava(Long postIdx, String javaCode) {
    this.postIdx = postIdx;
    this.javaCode = javaCode;
  }

}
