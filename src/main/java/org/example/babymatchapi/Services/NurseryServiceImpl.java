package org.example.babymatchapi.Services;

import org.example.babymatchapi.DTO.NurseryDTO;
import org.example.babymatchapi.Repository.NurseryRepository;
import org.example.babymatchapi.model.NurseryEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NurseryServiceImpl implements NurseryService {

    private final NurseryRepository nurseryRepository;

    public NurseryServiceImpl(NurseryRepository nurseryRepository) {
        this.nurseryRepository = nurseryRepository;
    }

    @Override
    public List<NurseryDTO> getAllNurseries() {
        return nurseryRepository.findAll().stream()
                .map(nursery -> NurseryDTO.builder()
                        .id(nursery.getId())
                        .name(nursery.getName())
                        .address(nursery.getAddress())
                        .city(nursery.getCity())
                        .postCode(nursery.getPostCode())
                        .nbChildrenMax(nursery.getNbChildrenMax())
                        .hourly(nursery.getHourly())
                        .userId(nursery.getUser().getAge())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public NurseryDTO getNurseryById(Long id) {
        NurseryEntity nursery = nurseryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nursery not found"));
        return NurseryDTO.builder()
                .id(nursery.getId())
                .name(nursery.getName())
                .address(nursery.getAddress())
                .city(nursery.getCity())
                .postCode(nursery.getPostCode())
                .nbChildrenMax(nursery.getNbChildrenMax())
                .hourly(nursery.getHourly())
                .userId(nursery.getUser().getAge())
                .build();
    }

}