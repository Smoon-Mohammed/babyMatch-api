package org.example.babymatchapi.DTO;

import lombok.*;

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
}
