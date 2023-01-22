package com.spring.security.repository;

import com.spring.security.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Object> {
    Member findByEmailId(String emailId);
}
