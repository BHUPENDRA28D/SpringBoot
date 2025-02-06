package com.dailycodeBuffer.spring_Security_client.Repository;

import com.dailycodeBuffer.spring_Security_client.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
