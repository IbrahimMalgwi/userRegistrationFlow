package com.ganzymalgwi.springsecurityregistrationloginflow.repository;

import com.ganzymalgwi.springsecurityregistrationloginflow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
