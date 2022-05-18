package com.example.MBankTest.service.util;



import com.example.MBankTest.dto.request.Request;
import com.example.MBankTest.dto.request.SupplierDto;

import java.math.BigDecimal;

public interface ValidateService {
    boolean checkParams(Request request);

    boolean checkAccountClient(String account);

    boolean checkSupplier(SupplierDto supplierDto);

    boolean checkHavingAmountOnSupplier(String supplierName, BigDecimal amount);
}
