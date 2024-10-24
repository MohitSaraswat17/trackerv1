package com.expenseapplication.expenseapp.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeDTO {
    private Long userId;
    private Long sourceId;
    private double amount;
    private String description;
    private LocalDate incomeDate;
    private String destination;
}
