package org.example.babymatchapi.Services;

import lombok.AllArgsConstructor;
import org.example.babymatchapi.DTO.ChildrenDTO;
import org.example.babymatchapi.Mapper.ChildrenMapper;
import org.example.babymatchapi.Repository.ChildrenRepository;
import org.example.babymatchapi.model.ChildrenEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ChildrenServiceImpl implements ChildrenService {
    private final ChildrenRepository childrenRepository;
    private final ChildrenMapper childrenMapper;
    public List<ChildrenDTO> getAllChildren() {
        List<ChildrenEntity> childrenEntities = childrenRepository.findAll();
        return childrenEntities.stream().map(childrenMapper::toDto)
                .collect(Collectors.toList());
    }
}
