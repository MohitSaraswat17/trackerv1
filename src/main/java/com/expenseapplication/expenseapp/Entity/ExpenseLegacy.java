package com.expenseapplication.expenseapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "expense_legacy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseLegacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legacyId;

    private Long expenseId;
    private Long userId;
    private Long categoryId;
    private double amount;
    private String description;
    private LocalDate expenseDate;
    private String paymentMethod;

    private String operationType; // UPDATE or DELETE
    private LocalDateTime operationTimestamp;

    // Getters and Setters
}