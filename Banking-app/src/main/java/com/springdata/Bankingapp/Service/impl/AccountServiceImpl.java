package com.springdata.Bankingapp.Service.impl;

import com.springdata.Bankingapp.Modal.Entity.Account;
import com.springdata.Bankingapp.Modal.Repository.AccountRepository;
import com.springdata.Bankingapp.Service.AccountService;
import com.springdata.Bankingapp.dto.AccountDto;
import com.springdata.Bankingapp.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public  AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.mapToAccount(accountDto);
        Account saveAccount=accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDto GetAccountById(Long id) {
        Account account=accountRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Account does not exists"));

        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public void delete(Long id) {
        Account account=accountRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Account does not exists"));
        accountRepository.deleteById(id);

    }

    @Override
    public AccountDto deposit(long id, double amount) {
        Account account=accountRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Account does not exists"));
        double total =account.getBalance()+amount;
        account.setBalance(total);
        Account savedAccount= accountRepository.save(account);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(long id, double amount) {
        Account account=accountRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Account does not exists"));
        double total =account.getBalance()-amount;
        account.setBalance(total);
        Account savedAccount= accountRepository.save(account);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public void transfer(long id1, long id2, double amount) {
        this.withdraw(id1,amount);
        AccountDto accountDto=this.deposit(id2,amount);

    }

    @Override
    public List<AccountDto> getAllAcounts() {
    List<Account> accounts=accountRepository.findAll();
    return accounts
            .stream()
            .map((account)-> AccountMapper.mapToAccountDto(account))
            .collect(Collectors.toList());

    }
}
