package com.example.MBankTest.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PayParams {
    String documentNumber;

    BigDecimal amount;

    String currency;

    String accountCode;
}
