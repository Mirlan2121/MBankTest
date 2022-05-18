package com.example.MBankTest.service.database;


import com.example.MBankTest.entity.PaymentDocument;
import com.example.MBankTest.service.base.CrudService;

public interface PaymentDocumentService extends CrudService<PaymentDocument> {
    PaymentDocument getResponseBodyByDocumentNumber(String documentNumber, String type);
}
