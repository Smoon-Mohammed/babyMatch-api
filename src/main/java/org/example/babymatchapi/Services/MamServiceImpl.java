package org.example.babymatchapi.Services;

import org.example.babymatchapi.DTO.MamDTO;
import org.example.babymatchapi.Repository.MamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MamServiceImpl implements MamService {

    private final MamRepository mamRepository ;

    public MamServiceImpl(MamRepository mamRepository) {
        this.mamRepository = mamRepository;
    }

    public List<MamDTO> getAllMams() {
        return mamRepository.findAll().stream()
                .map(mam -> MamDTO.builder()
                        .id(mam.getId())
                        .name(mam.getName())
                        .address(mam.getAddress())
                        .city(mam.getCity())
                        .postCode(mam.getPostCode())
                        .nbChildrenMax(mam.getNbChildrenMax())
                        .hourly(mam.getHourly())
                        .build())
                .collect(Collectors.toList());
    }


}
