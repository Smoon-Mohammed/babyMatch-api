package org.example.babymatchapi.Controllers;


import lombok.AllArgsConstructor;
import org.example.babymatchapi.DTO.ChildrenDTO;
import org.example.babymatchapi.Services.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/children")
public class ChildrenController {
    private ChildrenService childrenService;
    @GetMapping
    public List<ChildrenDTO> getChildren() {
        return childrenService.getAllChildren();
    }
}
