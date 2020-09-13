package com.tueteam.apl.domain.posts;

import com.tueteam.apl.domain.BaseTimeEntity;
import com.tueteam.apl.web.param.posts.cpp.PostsWriteParams;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Posts extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long postIdx;
  private Long boardIdx;
  private Long writeMemberIdx;

  private String title;
  private String contents;
  private String attachedFile;
  private int hits;
  private int statusCode;
  private DateTime deletedDate;

  public Posts(Long boardIdx, Long memberIdx, String title, String contents, String attachedFile) {
    this.boardIdx = boardIdx;
    this.writeMemberIdx = memberIdx;
    this.title = title;
    this.contents = contents;
    this.attachedFile = attachedFile;
  }

  public Posts(PostsWriteParams param) {
    this.boardIdx = param.getBoardIdx();
    this.writeMemberIdx = param.getWriteMemberIdx();
    this.title = param.getTitle();
    this.contents = param.getContents();
    this.attachedFile = param.getAttachedFile();
  }

}
