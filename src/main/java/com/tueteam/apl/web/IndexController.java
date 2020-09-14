package com.tueteam.apl.web;

import com.tueteam.apl.config.auth.dto.SessionMember;
import com.tueteam.apl.service.MemberService;
import com.tueteam.apl.service.PostsService;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;
    private final MemberService memberService;
    private final PostsService postsService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/board/c")
    public String boardC(Model model) {
        SessionMember member = (SessionMember) httpSession.getAttribute("member");
        if (member != null) {
            memberService.updateRoleMember(member);
            BoardCListResponseDto boardCAllList = postsService.findByboardCAll();
            model
        }
        return "board-c";
    }

    @GetMapping("/board/c/save")
    public String boardCSave(Model model) {
        SessionMember member = (SessionMember) httpSession.getAttribute("member");
        model.addAttribute("member", member);
        return "board-c-save";
    }

}
