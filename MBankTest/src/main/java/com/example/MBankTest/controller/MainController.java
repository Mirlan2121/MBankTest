package com.example.MBankTest.controller;


import com.example.MBankTest.dto.request.AuthSupplierDto;
import com.example.MBankTest.dto.request.Request;
import com.example.MBankTest.dto.response.Response;
import com.example.MBankTest.service.CheckAccountService;
import com.example.MBankTest.service.PaymentService;
import com.example.MBankTest.service.SignInService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MainController {
    @Autowired
    CheckAccountService checkAccountService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    SignInService signInService;

    @PostMapping("check")
    public Response checkAccount(@RequestBody Request request) {
        return checkAccountService.checkAccount(request);
    }

    @PostMapping("pay")
    public Response makePayment(@RequestBody Request request) {
        return paymentService.makePayment(request);
    }

    @PostMapping("get-token")
    public Response getToken(@RequestBody AuthSupplierDto authSupplierDto) {
        return signInService.getTokenSupplier(authSupplierDto);
    }


}
