package com.springdata.Bankingapp.Service;


import com.springdata.Bankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {
     AccountDto createAccount(AccountDto account) ;
     AccountDto GetAccountById(Long id) ;
     void delete(Long id) ;

     AccountDto deposit(long id, double amount);
     AccountDto withdraw(long id, double amount);
     void transfer(long id1, long id2, double amount);
     List<AccountDto> getAllAcounts();

}
