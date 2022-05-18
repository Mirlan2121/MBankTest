package com.example.MBankTest.service.database.impl;


import com.example.MBankTest.entity.PaymentDocument;
import com.example.MBankTest.repository.PaymentDocumentRepository;
import com.example.MBankTest.service.base.impl.CrudServiceImpl;
import com.example.MBankTest.service.database.PaymentDocumentService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentDocumentServiceImpl extends CrudServiceImpl<PaymentDocument> implements PaymentDocumentService {
    @Autowired
    PaymentDocumentRepository paymentDocumentRepository;

    public PaymentDocumentServiceImpl(PaymentDocumentRepository paymentDocumentRepository) {
        super(paymentDocumentRepository);
        this.paymentDocumentRepository = paymentDocumentRepository;
    }

    @Override
    public PaymentDocument getResponseBodyByDocumentNumber(String documentNumber, String type) {
        return paymentDocumentRepository.getByDocumentNumber(documentNumber, type);
    }
}
