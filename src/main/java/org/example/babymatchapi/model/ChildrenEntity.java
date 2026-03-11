package org.example.babymatchapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "children")
public class ChildrenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String sex;

    @Column(name = "birth_day", nullable = true)
    private Timestamp birthDay;
}