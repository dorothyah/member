package com.example.member.service;

import com.example.member.dto.MemberResponseDto;
import com.example.member.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public List<MemberResponseDto> findAllMember() {
        List<Member> allMembers =  memberRepository.findAll();
        ArrayList<MemberResponseDto> memberResponseDtos = new ArrayList<>();

        if (allMembers.isEmpty()) {
            throw new NullPointerException("No User Found");
        }

        for (Member allMember : allMembers) {
            memberResponseDtos.add(new MemberResponseDto(allMember));
        }
    }

    @Transactional
    public MemberResponseDto findMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new NullPointerException("No User Found")
        );
        return new MemberResponseDto(foundMember);
    }
}
