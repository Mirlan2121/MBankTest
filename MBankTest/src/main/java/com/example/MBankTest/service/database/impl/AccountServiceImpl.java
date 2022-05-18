package com.example.MBankTest.service.database.impl;

import com.example.MBankTest.entity.Account;
import com.example.MBankTest.repository.AccountRepository;
import com.example.MBankTest.service.base.impl.CrudServiceImpl;
import com.example.MBankTest.service.database.AccountService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountServiceImpl extends CrudServiceImpl<Account> implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        super(accountRepository);
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getAccountByAccountCode(String accountCode) {
        return accountRepository.findAccountByAccountCode(accountCode);
    }
}
