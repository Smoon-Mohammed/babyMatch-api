package org.example.babymatchapi.DTO;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointDTO {
    private Long id;
    private String title;
    private String description;
    private String stats;
    private Timestamp date;
}
