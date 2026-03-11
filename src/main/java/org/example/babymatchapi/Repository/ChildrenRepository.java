package org.example.babymatchapi.Repository;

import org.example.babymatchapi.DTO.ChildrenDTO;
import org.example.babymatchapi.model.ChildrenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildrenRepository extends JpaRepository<ChildrenEntity, Long> {
}
