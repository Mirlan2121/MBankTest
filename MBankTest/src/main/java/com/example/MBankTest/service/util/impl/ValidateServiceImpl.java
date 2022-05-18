package com.example.MBankTest.service.util.impl;


import com.example.MBankTest.dto.request.Request;
import com.example.MBankTest.dto.request.SupplierDto;
import com.example.MBankTest.entity.Account;
import com.example.MBankTest.entity.Supplier;
import com.example.MBankTest.service.database.AccountService;
import com.example.MBankTest.service.database.SupplierService;
import com.example.MBankTest.service.util.ValidateService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ValidateServiceImpl implements ValidateService {
    @Autowired
    AccountService accountService;

    @Autowired
    SupplierService supplierService;

    @Override
    public boolean checkParams(Request request) {
        return request.getSupplier() == null ||
                request.getSupplier().getSupplierName() == null ||

                request.getPayParams() == null ||
                request.getPayParams().getDocumentNumber() == null ||
                request.getPayParams().getAmount() == null ||
                request.getPayParams().getCurrency() == null ||
                request.getPayParams().getAccountCode() == null;
    }

    @Override
    public boolean checkAccountClient(String account) {
        return accountService.getAccountByAccountCode(account) == null;
    }

    @Override
    public boolean checkSupplier(SupplierDto supplierDto) {
        Supplier supplier = supplierService.getBySupplierByName(supplierDto.getSupplierName());
        return supplier == null || supplier.getIsActive() == 0;
    }

    @Override
    public boolean checkHavingAmountOnSupplier(String supplierName, BigDecimal amount) {
        Account account = accountService.getAccountByAccountCode(supplierService.getBySupplierByName(supplierName).getSupplierCode());
        if (account == null)
            return false;
        return account.getAmount().compareTo(amount) <= 0;
    }
}
