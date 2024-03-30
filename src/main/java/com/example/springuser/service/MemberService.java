package com.example.springuser.service;

import com.example.springuser.dto.MemberDTO;
import com.example.springuser.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository; //@RequiredArgsConstructor
    public void save(MemberDTO memberDTO) {

    }
}
