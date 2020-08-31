package com.tueteam.apl.web;

import com.tueteam.apl.domain.member.Member;
import com.tueteam.apl.domain.member.MemberRepository;
import com.tueteam.apl.domain.member.Role;
import com.tueteam.apl.web.dto.TestUserDto;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class LoginController {

  private final MemberRepository memberRepository;

  @RequestMapping("/login/testUserLogin")
  public String testUserLogin(HttpServletRequest request) {

    Member member = memberRepository.findByMemberName("user")
        .orElseGet(() -> memberRepository.save(new Member("user", "user@gmail.com", Role.MEMBER)));

    Authentication authentication = new UsernamePasswordAuthenticationToken(member.getMemberName(),
        null, null);

    SecurityContext securityContext = SecurityContextHolder.getContext();
    securityContext.setAuthentication(authentication);
    HttpSession session = request.getSession();

    session.setAttribute("loginUser",
        new TestUserDto(member.getMemberIdx(), member.getMemberName(), member.getEmail()));

    return "redirect:/";
  }


}
