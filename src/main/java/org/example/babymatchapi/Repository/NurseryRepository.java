package org.example.babymatchapi.Repository;

import org.example.babymatchapi.model.NurseryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseryRepository extends JpaRepository<NurseryEntity,Long> {
}
