package com.expenseapplication.expenseapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "account_legacy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountLegacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legacyId;

    private Long accountId;
    private Long userId;
    private String accountName;
    private String accountNumber;
    private String ifscCode;

    private String operationType; // UPDATE or DELETE
    private LocalDateTime operationTimestamp;

    // Getters and Setters
}
