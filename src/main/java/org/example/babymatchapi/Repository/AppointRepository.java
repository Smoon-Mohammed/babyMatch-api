package org.example.babymatchapi.Repository;

import org.example.babymatchapi.model.AppointEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointRepository extends JpaRepository<AppointEntity, Long> {
}
