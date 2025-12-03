package org.example.babymatchapi.Controllers;


import org.example.babymatchapi.DTO.MamDTO;
import org.example.babymatchapi.Services.MamService;
import org.example.babymatchapi.Services.NurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mams")
public class MamController {
    private final MamService mamService;

    public MamController(MamService mamService) {
        this.mamService = mamService;
    }
    @GetMapping
     public List<MamDTO> getAllMams() {
         return mamService.getAllMams();
     }
}
