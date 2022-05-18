package com.example.MBankTest.service;


import com.example.MBankTest.dto.request.Request;
import com.example.MBankTest.dto.response.Response;

public interface PaymentService {
    Response makePayment(Request request);
}
