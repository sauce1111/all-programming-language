package com.tueteam.apl.web;

import com.tueteam.apl.domain.posts.PageInfo;
import com.tueteam.apl.domain.posts.PostsQdslRepository;
import com.tueteam.apl.service.PostsCppService;
import com.tueteam.apl.web.param.posts.cpp.PostListParams;
import com.tueteam.apl.web.dto.posts.cpp.PostsCppDto;
import com.tueteam.apl.web.param.posts.cpp.PostsWriteParams;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/posts/cpp")
public class PostsCppController {

  private final PostsCppService postsCppService;
  private final PostsQdslRepository postsQdslRepository;

  @GetMapping("/basicPostList")
  public String basicPostList(Model model, PostListParams param) {

    PageInfo pageInfo =
        new PageInfo(param.getRecordCountPerPage(), param.getPageSize(), param.getCurrentPageNo());

    Page<PostsCppDto> postsCppList =
        postsQdslRepository.retrievePostsCppList(param, pageInfo.getPageRequest());

    model.addAttribute("postsCppList", postsCppList)
        .addAttribute("pageInfo", pageInfo.init(postsCppList.getTotalElements()));

    return "posts/cpp/basicPostList";
  }


  @GetMapping("/basicPostWrite")
  public String basicPostWrite() {
    return "posts/cpp/basicPostEdit";
  }

  @PostMapping
  public ResponseEntity<PostsCppDto> insertPost(PostsWriteParams param){
    PostsCppDto post = postsCppService.insertPostsCpp(param);
    return new ResponseEntity<>(post, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<PostsCppDto> selectPost(Long postIdx){
    PostsCppDto post = postsQdslRepository.findPostsCppById(postIdx);
    return new ResponseEntity<>(post, HttpStatus.OK);
  }

}
