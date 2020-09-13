package com.tueteam.apl.web.param.posts.cpp;

import com.tueteam.apl.web.param.PageParams;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostListParams extends PageParams {
  String postKeyword;
  Integer sortNo;
}
