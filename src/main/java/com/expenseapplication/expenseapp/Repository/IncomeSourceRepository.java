package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseapplication.expenseapp.Entity.IncomeSource;

@Repository
public interface IncomeSourceRepository extends JpaRepository<IncomeSource,Long> {

}
