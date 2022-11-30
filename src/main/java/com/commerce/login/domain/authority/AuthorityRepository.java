package com.commerce.login.domain.authority;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
    Optional<Authority> findByAuthorityName(MemberAuth authorityName);
}
