package com.dailycodeBuffer.spring_Security_client.Repository;

import com.dailycodeBuffer.spring_Security_client.Entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository <VerificationToken,Long> {
}
