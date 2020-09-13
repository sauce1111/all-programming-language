package com.tueteam.apl.web.param.posts.cpp;

import lombok.Data;

@Data
public class PostsWriteParams {

  private Long boardIdx;
  private Long writeMemberIdx;

  private String title;
  private String contents;
  private String attachedFile;

  String tag;
}
