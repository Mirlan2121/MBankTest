package com.example.MBankTest.service;


import com.example.MBankTest.dto.request.AuthSupplierDto;
import com.example.MBankTest.dto.response.Response;

public interface SignInService {
    Response getTokenSupplier(AuthSupplierDto authSupplierDto);
}
