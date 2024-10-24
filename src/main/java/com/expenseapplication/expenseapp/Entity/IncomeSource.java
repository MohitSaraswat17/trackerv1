package com.expenseapplication.expenseapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "income_source")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sourceId;

    @Column(nullable = false, unique = true)
    private String sourceName;

    @OneToMany(mappedBy = "source", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Income> incomes;

    // Getters and Setters
}
