package com.expenseapplication.expenseapp.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseapplication.expenseapp.Dto.UserDTO;
import com.expenseapplication.expenseapp.Entity.User;
import com.expenseapplication.expenseapp.Entity.UserLegacy;
import com.expenseapplication.expenseapp.Repository.UserLegacyRepository;
import com.expenseapplication.expenseapp.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserLegacyRepository userLegacyRepository;

    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());  
        user.setOccupation(userDTO.getOccupation());
        
        return userRepository.save(user);
    }

    public User updateUser(Long userId, UserDTO userDTO) {
        // Fetch the current user
        User currentUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Create a legacy record before updating the current user
        UserLegacy legacy = new UserLegacy();
        legacy.setUserId(currentUser.getUserId());
        legacy.setUsername(currentUser.getUsername());
        legacy.setEmail(currentUser.getEmail());
        legacy.setPassword(currentUser.getPassword());
        legacy.setOccupation(currentUser.getOccupation());
        legacy.setOperationType("UPDATE");
        legacy.setOperationTimestamp(LocalDateTime.now());

        userLegacyRepository.save(legacy);

        if (userDTO.getUsername() != null) {
            currentUser.setUsername(userDTO.getUsername());
        }
        if (userDTO.getEmail() != null) {
            currentUser.setEmail(userDTO.getEmail());
        }
        if (userDTO.getPassword() != null) {
            currentUser.setPassword(userDTO.getPassword());
        }
        if (userDTO.getOccupation() != null) {
            currentUser.setOccupation(userDTO.getOccupation());
        }

        return userRepository.save(currentUser); // Save the updated user
    }
    
}
