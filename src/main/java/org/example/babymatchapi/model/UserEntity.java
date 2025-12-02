package org.example.babymatchapi.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Array;
import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false,unique = true, length = 50)
    private String email;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime create_at;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(name = "first_name", nullable = false, length = 100)
    private String Firstname;

    @Column(name = "last_name", nullable = false, length = 100)
    private String Lastname;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false,  length = 100)
    private String address;

    @Column(nullable = false)
    private String city;



}
