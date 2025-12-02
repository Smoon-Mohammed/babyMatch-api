package org.example.babymatchapi.DTO;

import lombok.*;

import java.sql.Array;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
  private Long id;
  private String username;
  private String email;
  private LocalDateTime created_at;
  private String firstName;
  private String lastName;
  private Integer age;
  private String address;
  private String city;
  private Array roles;
}
