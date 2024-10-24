package com.expenseapplication.expenseapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expenseapplication.expenseapp.Entity.UserLegacy;

public interface UserLegacyRepository extends JpaRepository<UserLegacy,Long> {

}
