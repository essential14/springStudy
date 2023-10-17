package com.example.springhello;

import com.example.springhello.repository.MemberRepository;
import com.example.springhello.repository.MemoryMemberRepository;
import com.example.springhello.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
