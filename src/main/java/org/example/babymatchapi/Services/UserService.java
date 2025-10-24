package org.example.babymatchapi.Services;
import org.example.babymatchapi.DTO.UserDTO;
import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
}
