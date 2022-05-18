package com.example.MBankTest.entity;


import com.example.MBankTest.entity.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment_documents")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentDocument extends BaseEntity {
    @Column(name = "document_number", nullable = false)
    String documentNumber;

    @Column(name = "type", nullable = false)
    String type;

    @Column(name = "amount")
    BigDecimal amount;

    @Column(name = "currency", nullable = false)
    String currency;

    @Column(name = "recipient_account", nullable = false)
    String recipientAccount;

    @Column(name = "payer_account", nullable = false)
    String payerAccount;

    @Column(name = "status")
    Long status;

    @Column(name = "input_date", nullable = false)
    LocalDateTime inputDate;

    @Column(name = "request_body", nullable = false)
    String requestBody;
}
