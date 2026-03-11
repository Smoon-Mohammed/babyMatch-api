package org.example.babymatchapi.Services;

import lombok.AllArgsConstructor;
import org.example.babymatchapi.DTO.AppointDTO;
import org.example.babymatchapi.Mapper.AppointMapper;
import org.example.babymatchapi.Repository.AppointRepository;
import org.example.babymatchapi.model.AppointEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AppointServiceImpl implements AppointService{
    private final AppointRepository appointRepository;
    private final AppointMapper appointMapper;
    public List<AppointDTO> getAllAppoint() {
        List<AppointEntity> appointEntities = appointRepository.findAll();
        return appointEntities.stream().map(appointMapper::toDto).collect(Collectors.toList());
    }
}
