package com.example.springhello.repository;

import com.example.springhello.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByNmae(String name);
    List<Member> findAll();
}
