package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseapplication.expenseapp.Entity.ExpenseLegacy;

@Repository
public interface ExpenseLegacyRepository extends JpaRepository<ExpenseLegacy, Long> {
    long countByExpenseId(Long expenseId);  // To track versioning
}

