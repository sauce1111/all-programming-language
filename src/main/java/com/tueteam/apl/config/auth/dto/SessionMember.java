package com.tueteam.apl.config.auth.dto;

import com.tueteam.apl.domain.member.Member;
import lombok.Getter;

@Getter
public class SessionMember {

    private Long memberIdx;
    private String name;
    private String email;

    public SessionMember(Member member) {
        this.memberIdx = member.getMemberIdx();
        this.name = member.getMemberName();
        this.email = member.getEmail();
    }
}
