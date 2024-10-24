package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseapplication.expenseapp.Entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}
