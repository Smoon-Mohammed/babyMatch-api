package org.example.babymatchapi.Services;

import org.example.babymatchapi.DTO.NurseryDTO;

import java.util.List;

public interface NurseryService {
    List<NurseryDTO> getAllNurseries();
    NurseryDTO getNurseryById(Long id);

}
