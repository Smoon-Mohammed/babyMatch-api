package org.example.babymatchapi.Services;

import org.example.babymatchapi.DTO.UserDTO;
import org.example.babymatchapi.model.UserEntity;
import org.example.babymatchapi.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> UserDTO.builder()
                        .id(user.getId())
                        .username(user.getUsername())
                        .email(user.getEmail())
                        .created_at(user.getCreate_at())
                        .firstName(user.getFirstname())
                        .lastName(user.getLastname())
                        .age(user.getAge())
                        .address(user.getAddress())
                        .city(user.getCity())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .created_at(user.getCreate_at())
                .firstName(user.getFirstname())
                .lastName(user.getLastname())
                .age(user.getAge())
                .address(user.getAddress())
                .city(user.getCity())
                .build();
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity entity = UserEntity.builder()
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .Firstname(userDTO.getFirstName())
                .Lastname(userDTO.getLastName())
                .age(userDTO.getAge())
                .address(userDTO.getAddress())
                .city(userDTO.getCity())
                .build();

        UserEntity saved = userRepository.save(entity);
        return UserDTO.builder()
                .id(saved.getId())
                .username(saved.getUsername())
                .email(saved.getEmail())
                .created_at(saved.getCreate_at())
                .firstName(saved.getFirstname())
                .lastName(saved.getLastname())
                .age(saved.getAge())
                .address(saved.getAddress())
                .city(saved.getCity())
                .build();
    }
}
