package com.example.MBankTest.factory;


import com.example.MBankTest.dto.response.Response;
import com.example.MBankTest.enums.Result;
import org.springframework.stereotype.Component;

@Component
public class ResponseFactory {
    public Response getInvalidDetailsResponse() {
        return Response.builder()
                .code(Result.INVALID_DETAILS.getErrorId())
                .description(Result.INVALID_DETAILS.getDescription())
                .build();
    }

    public Response getServiceNotAvailableResponse() {
        return Response.builder()
                .code(Result.SERVICE_NOT_AVAILABLE.getErrorId())
                .description(Result.SERVICE_NOT_AVAILABLE.getDescription())
                .build();
    }

    public Response getSupplierErrorResponse() {
        return Response.builder()
                .code(Result.SUPPLIER_ERROR.getErrorId())
                .description(Result.SUPPLIER_ERROR.getDescription())
                .build();
    }

    public Response getFailPaymentResponse() {
        return Response.builder()
                .code(Result.FAIL_PAYMENT.getErrorId())
                .description(Result.FAIL_PAYMENT.getDescription())
                .build();
    }

    public Response getNotHaveAmountOnAccountResponse() {
        return Response.builder()
                .code(Result.AMOUNT_GREATER_ZERO.getErrorId())
                .description(Result.AMOUNT_GREATER_ZERO.getDescription())
                .build();
    }

    public Response getInvalidLoginOrPasswordResponse() {
        return Response.builder()
                .code(Result.WRONG_LOGIN_OR_PASSWORD.getErrorId())
                .description(Result.WRONG_LOGIN_OR_PASSWORD.getDescription())
                .build();
    }
}
