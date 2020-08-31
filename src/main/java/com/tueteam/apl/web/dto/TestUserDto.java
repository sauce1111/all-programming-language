package com.tueteam.apl.web.dto;

import lombok.Getter;

@Getter
public class TestUserDto {

  private Long memberIdx;
  private String memberName;
  private String email;

  public TestUserDto(Long memberIdx, String memberName, String email) {
    this.memberIdx = memberIdx;
    this.memberName = memberName;
    this.email = email;
  }
}
