package com.example.MBankTest.service.database;



import com.example.MBankTest.entity.Account;
import com.example.MBankTest.service.base.CrudService;

public interface AccountService extends CrudService<Account> {
    Account getAccountByAccountCode(String accountCode);
}
