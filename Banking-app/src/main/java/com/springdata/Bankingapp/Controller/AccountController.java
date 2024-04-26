package com.springdata.Bankingapp.Controller;

import com.springdata.Bankingapp.Modal.Entity.Account;
import com.springdata.Bankingapp.Service.AccountService;
import com.springdata.Bankingapp.Service.impl.AccountServiceImpl;
import com.springdata.Bankingapp.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private  AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }





    //Add Account Rest Api
    @PostMapping("save_account")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){

        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
    //Get Account Rest Api
    @GetMapping("get_account")
    public  ResponseEntity<AccountDto> getAccountById(@RequestParam long id){
        AccountDto accountDto=accountService.GetAccountById(id);
        return ResponseEntity.ok(accountDto);
    }
    // deposit Rest Api
    @PutMapping("/deposit/{id}/{amount}")
    public ResponseEntity<AccountDto> deposit(@PathVariable long id,@PathVariable double amount){
        AccountDto accountDto=accountService.deposit(id,amount);
        return ResponseEntity.ok(accountDto);
    }
    // withdraw Rest api
    @PutMapping("/withdraw/{id}/{amount}")
    public ResponseEntity<AccountDto> withdraw(@PathVariable long id,@PathVariable double amount){
        AccountDto accountDto=accountService.withdraw(id,amount);
        return ResponseEntity.ok(accountDto);
    }
    // get All Accounts Rest Api
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accounts=accountService.getAllAcounts();
        return ResponseEntity.ok(accounts);
    }
 // delete Rest Api
 @GetMapping("delete")
 public  void delete(@RequestParam long id){
     accountService.delete(id);

 }

 // transfer Rest Api
 @PutMapping("/transfer/{id}/{id1}/{amount}")
 public void transfer(@PathVariable long id,@PathVariable long id1,@PathVariable double amount){
    accountService.transfer(id,id1,amount);
 }

}
