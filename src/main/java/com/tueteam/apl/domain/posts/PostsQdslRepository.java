package com.tueteam.apl.domain.posts;


import static com.tueteam.apl.domain.member.QMember.member;
import static com.tueteam.apl.domain.posts.QPosts.posts;
import static com.tueteam.apl.domain.posts.QPostsCpp.postsCpp;

import com.tueteam.apl.config.QdslSupport;
import com.tueteam.apl.web.dto.posts.cpp.PostsCppDto;
import com.tueteam.apl.web.dto.posts.cpp.QPostsCppDto;
import com.tueteam.apl.web.param.posts.cpp.PostListParams;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Repository
@Transactional(readOnly = true)
public class PostsQdslRepository extends QdslSupport {

  public PostsQdslRepository() {
    super(Posts.class);
  }

  public Page<PostsCppDto> retrievePostsCppList(PostListParams param, Pageable pageable) {
    return applyPagination(pageable, query -> query
        .select(new QPostsCppDto(
            posts.postIdx, posts.title, posts.contents,
            posts.attachedFile, posts.hits, posts.createdDate,
            postsCpp.replyCount, postsCpp.likeCount, postsCpp.dislikeCount, postsCpp.tag,
            member.memberIdx, member.memberName
        ))
        .from(posts)
        .join(member).on(posts.writeMemberIdx.eq(member.memberIdx))
        .leftJoin(postsCpp).on(posts.postIdx.eq(postsCpp.postIdx))
        .where(
            posts.statusCode.eq(0),
            (StringUtils.isEmpty(param.getPostKeyword())) ? null :
                posts.title.contains(param.getPostKeyword())
                .or(posts.contents.contains(param.getPostKeyword()))
                .or(postsCpp.tag.contains(param.getPostKeyword()))
        )
        .orderBy(
            (StringUtils.isEmpty(param.getSortNo()) || param.getSortNo() == 1) ?
                posts.createdDate.desc() :
            (param.getSortNo() == 2) ?
                posts.hits.desc() :
            (param.getSortNo() == 3) ?
                postsCpp.likeCount.desc() :
            (param.getSortNo() == 4) ?
                postsCpp.replyCount.desc() : null,
            posts.postIdx.desc()
        )
    );
  }

  public PostsCppDto findPostsCppById(Long postIdx){
    return select(new QPostsCppDto(
          posts.postIdx, posts.title, posts.contents,
          posts.attachedFile, posts.hits, posts.createdDate,
          postsCpp.replyCount, postsCpp.likeCount, postsCpp.dislikeCount, postsCpp.tag,
          member.memberIdx, member.memberName
        ))
        .from(posts)
        .join(member).on(posts.writeMemberIdx.eq(member.memberIdx))
        .leftJoin(postsCpp).on(posts.postIdx.eq(postsCpp.postIdx))
        .where(posts.postIdx.eq(postIdx))
        .fetchOne();
  }


}