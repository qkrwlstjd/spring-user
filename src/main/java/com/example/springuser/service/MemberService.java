package com.example.springuser.service;

import com.example.springuser.dto.MemberDTO;
import com.example.springuser.entity.MemberEntity;
import com.example.springuser.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository; //@RequiredArgsConstructor

    public void save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        Optional<MemberEntity> byMemberEmail = memberRepository.findByMemberEmail(memberDTO.getMemberEmail());
        if (byMemberEmail.isPresent()) {
            //isPresent=존재한다.
            MemberEntity memberEntity = byMemberEmail.get();
            if (memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())) {
                //java 문자열 비교할때 equals 사용해야함. ==는 주소값 비교
                MemberDTO loginUser = MemberDTO.toMemberDTO(memberEntity);
                return loginUser;
            } else {
                return null;
            }

        } else {
            return null;
        }
    }
}
