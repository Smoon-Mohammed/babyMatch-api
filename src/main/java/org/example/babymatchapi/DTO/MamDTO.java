package org.example.babymatchapi.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MamDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private Integer postCode;
    private Integer nbChildrenMax;
    private String hourly;

}
