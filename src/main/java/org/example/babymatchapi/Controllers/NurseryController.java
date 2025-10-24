package org.example.babymatchapi.Controllers;

import org.example.babymatchapi.DTO.NurseryDTO;
import org.example.babymatchapi.Services.NurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurseries")
public class NurseryController {

    private final NurseryService nurseryService;

    @Autowired
    public NurseryController(NurseryService nurseryService) {
        this.nurseryService = nurseryService;
    }

    @GetMapping
    public List<NurseryDTO> getAllNurseries() {
        return nurseryService.getAllNurseries();
    }

    @GetMapping("/{id}")
    public NurseryDTO getNurseryById(@PathVariable Long id) {
        return nurseryService.getNurseryById(id);
    }
}