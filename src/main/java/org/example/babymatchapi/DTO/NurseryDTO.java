package org.example.babymatchapi.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NurseryDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private Integer postCode;
    private Integer nbChildrenMax;
    private String hourly;
    private Integer userId;
}
