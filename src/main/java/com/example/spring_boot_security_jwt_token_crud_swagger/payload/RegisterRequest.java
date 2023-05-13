package com.example.spring_boot_security_jwt_token_crud_swagger.payload;


import com.example.spring_boot_security_jwt_token_crud_swagger.entitys.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private Role role;
}
