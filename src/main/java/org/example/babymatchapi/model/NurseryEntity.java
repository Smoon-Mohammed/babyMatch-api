package org.example.babymatchapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nursery")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NurseryEntity {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,  length = 100)
    private String name;

    @Column(nullable = false,  length = 100)
    private String address;

    @Column(nullable = false,  length = 100)
    private String city;

    @Column(nullable = false)
    private Integer postCode;

    @Column(nullable = false)
    private Integer nbChildrenMax;

    @Column(nullable = false)
    private String hourly;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "user_id")
    private UserEntity user;
}
