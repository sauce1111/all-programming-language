package com.tueteam.apl.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/posts/java")
public class PostsJavaController {

  @GetMapping("/basicPostList")
  public String basicPostList(Model model) {
    System.out.println("PostsJavaController.basicPostList");
    return "posts/java/basicPostList";
  }
}
