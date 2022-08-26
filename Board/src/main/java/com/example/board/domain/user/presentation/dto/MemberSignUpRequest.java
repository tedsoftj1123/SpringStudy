package com.example.board.domain.user.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSignUpRequest {
     private String email;
     private String memberId;
     private String memberPassword;
}
