package org.example.babymatchapi.Mapper;

import org.example.babymatchapi.DTO.ChildrenDTO;
import org.example.babymatchapi.model.ChildrenEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChildrenMapper {
    ChildrenDTO toDto(ChildrenEntity childrenEntity);
    ChildrenEntity childrenDtoToChildren(ChildrenDTO childrenDTO );
}
