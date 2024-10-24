package com.expenseapplication.expenseapp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private String accountName;
    private String accountNumber;
    private String ifscCode;
    private String accountType;

    
}

