package org.example.babymatchapi.Mapper;
import org.example.babymatchapi.DTO.UserDTO;
import org.example.babymatchapi.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    UserDTO toDto(UserEntity user);
    UserEntity toEntity(UserDTO dto);
}