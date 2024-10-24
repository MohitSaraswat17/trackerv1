package com.expenseapplication.expenseapp.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_legacy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLegacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legacyId;

    private Long userId;
    private String username;
    private String email;
    private String password;
    private String occupation;

    private String operationType; // UPDATE or DELETE
    private LocalDateTime operationTimestamp;

   

    // Getters and Setters
}
