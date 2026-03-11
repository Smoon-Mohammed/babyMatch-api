package org.example.babymatchapi.Controllers;

import lombok.AllArgsConstructor;
import org.example.babymatchapi.DTO.AppointDTO;
import org.example.babymatchapi.Services.AppointService;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/appoint")
public class AppointController {
    private AppointService appointService;
    @GetMapping
    public List<AppointDTO> getAppoint() {return appointService.getAllAppoint();}
}
