package com.example.spring_boot_security_jwt_token_crud_swagger.repositorys;

import com.example.spring_boot_security_jwt_token_crud_swagger.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
