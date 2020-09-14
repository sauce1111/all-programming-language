package com.tueteam.apl.domain.member;

import com.tueteam.apl.domain.BaseTimeEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberIdx;

    @Column(nullable = false)
    private String memberName;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public Member(String memberName, String email, Role role) {
        this.memberName = memberName;
        this.email = email;
        this.role = role;
    }

    public Member update(String memberName) {
        this.memberName = memberName;
        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

    public void updateRoleMember(Role roleMember) {
        this.role = roleMember;
    }

}
