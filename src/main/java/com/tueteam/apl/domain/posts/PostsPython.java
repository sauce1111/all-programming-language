package com.tueteam.apl.domain.posts;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class PostsPython {

  @Id
  private Long postIdx;
  private String pythonCode;

}
