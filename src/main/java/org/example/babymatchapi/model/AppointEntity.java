package org.example.babymatchapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Timer;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "appoint")
public class AppointEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String stats;
    @Column
    private Timestamp date;

}
