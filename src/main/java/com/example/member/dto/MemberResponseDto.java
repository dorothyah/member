package com.example.member.dto;

public class MemberResponseDto {
    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberResponseDto(Member entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.pw = entity.getPw();
    }
}
