package org.example.babymatchapi.Repository;

import org.example.babymatchapi.model.NurseryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MamRepository  extends JpaRepository<NurseryEntity,Long> {
}
