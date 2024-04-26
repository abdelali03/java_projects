package com.springdata.Bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private  Long Id;
    private  String AccountHolderName;
    private double Balance;
}
