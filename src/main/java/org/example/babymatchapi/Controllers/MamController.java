package org.example.babymatchapi.Controllers;


import org.example.babymatchapi.Services.NurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MamController {
    private final NurseryService nurseryService;

    @Autowired
    public MamController(NurseryService nurseryService) {
        this.nurseryService = nurseryService;
    }

    @GetMapping
     public List<MamDTO> getAllMams() {
         return nurseryService.getAllMams();
     }
}
