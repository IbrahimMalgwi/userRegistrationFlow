package com.ganzymalgwi.springsecurityregistrationloginflow.repository;

import com.ganzymalgwi.springsecurityregistrationloginflow.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends
        JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}
