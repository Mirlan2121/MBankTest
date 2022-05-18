package com.example.MBankTest.service.impl;


import com.example.MBankTest.dto.request.AuthSupplierDto;
import com.example.MBankTest.dto.response.Response;
import com.example.MBankTest.entity.Supplier;
import com.example.MBankTest.factory.ResponseFactory;
import com.example.MBankTest.service.SignInService;
import com.example.MBankTest.service.database.SupplierService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignInServiceImpl implements SignInService {
    @Autowired
    SupplierService supplierService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    ResponseFactory responseFactory;

    @Override
    public Response getTokenSupplier(AuthSupplierDto authSupplierDto) {
        Supplier supplier = supplierService.getBySupplierByName(authSupplierDto.getSupplierName());

        boolean isMatches = passwordEncoder.matches(authSupplierDto.getPassword(), supplier.getPassword());
        if (isMatches) {
            return Response.builder()
                    .description("Basic " + new String(Base64.getEncoder()
                            .encode((supplier.getSupplierName() + ":" + authSupplierDto.getPassword()).getBytes())))
                    .build();
        }
        return responseFactory.getInvalidLoginOrPasswordResponse();
    }
}
