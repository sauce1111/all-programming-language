package com.tueteam.apl.service;//package com.tueteam.alc.service;

import com.tueteam.apl.config.auth.dto.SessionMember;
import com.tueteam.apl.domain.member.Member;
import com.tueteam.apl.domain.member.MemberRepository;
import com.tueteam.apl.domain.member.Role;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void updateRoleMember(SessionMember member) {
        Role updateRole = Role.MEMBER;
        Member roleMember = memberRepository
            .findByEmail(member.getEmail())
            .orElseThrow(
                () -> new IllegalArgumentException("해당 사용자가 없습니다. email=" + member.getEmail()));
        roleMember.updateRoleMember(updateRole);
    }
}
