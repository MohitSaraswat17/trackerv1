package com.expenseapplication.expenseapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "income_legacy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeLegacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legacyId;

    private Long incomeId;
    private Long userId;
    private Long sourceId;
    private double amount;
    private String description;
    private LocalDate incomeDate;
    private String destination;

    private String operationType; // UPDATE or DELETE
    private LocalDateTime operationTimestamp;

    // Getters and Setters
}
