package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseapplication.expenseapp.Entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income,Long> {

}
