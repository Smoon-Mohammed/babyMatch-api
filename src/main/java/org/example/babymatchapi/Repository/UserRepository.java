package org.example.babymatchapi.Repository;

import org.example.babymatchapi.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}