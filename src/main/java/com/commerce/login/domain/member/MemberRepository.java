package com.commerce.login.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<String, Long> {
    Optional<Member> findByEmail(String email);
    boolean existsbyEmail(String email); //count 보단 exists 라고 하는구먼...?
}
