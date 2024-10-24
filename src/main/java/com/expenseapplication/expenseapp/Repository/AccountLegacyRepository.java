package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseapplication.expenseapp.Entity.AccountLegacy;

@Repository
public interface AccountLegacyRepository extends JpaRepository<AccountLegacy,Long>{
    long countByAccountId(Long accountId);  
}
