package com.springdata.Bankingapp.Modal.Repository;

import com.springdata.Bankingapp.Modal.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
