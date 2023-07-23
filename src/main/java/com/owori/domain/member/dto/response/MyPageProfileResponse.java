package com.owori.domain.member.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyPageProfileResponse {
    private String nickname;
    private LocalDate birthday;
    private String myColor;
}
