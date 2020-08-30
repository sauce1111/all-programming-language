package com.tueteam.apl.config.auth.dto;

import com.tueteam.apl.domain.member.Member;
import lombok.Getter;

@Getter
public class SessionMember {

    private String name;
    private String email;

    public SessionMember(Member member) {
        this.name = member.getMemberName();
        this.email = member.getEmail();
    }
}
