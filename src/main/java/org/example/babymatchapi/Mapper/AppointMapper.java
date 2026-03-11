package org.example.babymatchapi.Mapper;

import org.example.babymatchapi.DTO.AppointDTO;
import org.example.babymatchapi.model.AppointEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppointMapper {
    AppointDTO toDto(AppointEntity appointEntity);
    AppointEntity appointDtoToAppoint(AppointDTO appointDTO);
}
