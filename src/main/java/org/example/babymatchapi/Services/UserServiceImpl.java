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
                .map(user -> new UserDTO(
                        user.getId(),
                        user.getUsername(),
                        user.getEmail(),
                        user.getCreate_at()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), user.getCreate_at());
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity entity = UserEntity.builder()
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .build();

        UserEntity saved = userRepository.save(entity);
        return new UserDTO(saved.getId(), saved.getUsername(), saved.getEmail(), saved.getCreate_at());
    }
}
