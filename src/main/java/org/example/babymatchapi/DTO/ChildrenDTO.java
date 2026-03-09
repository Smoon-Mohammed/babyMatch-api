package org.example.babymatchapi.DTO;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChildrenDTO {
    private Long id;
    private String firstName;
    private String name;
    private String sex;
    private Date birthDate;
}
