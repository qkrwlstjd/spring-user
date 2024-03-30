package com.example.springuser.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor //기본생성자(변수x)
@AllArgsConstructor //생성자(변수o)
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
