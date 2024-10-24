package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseapplication.expenseapp.Entity.IncomeLegacy;

@Repository
public interface IncomeLegacyRepository extends JpaRepository<IncomeLegacy, Long> {
    long countByIncomeId(Long incomeId);  

}
