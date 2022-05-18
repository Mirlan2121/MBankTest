package com.example.MBankTest.entity;

import com.example.MBankTest.entity.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account extends BaseEntity {

    @Column(name = "account_code", unique = true, nullable = false)
    String accountCode;

    @Column(name = "amount", nullable = false)
    BigDecimal amount;

    @Column(name = "full_name", nullable = false)
    String fullName;

    @Column(name = "inn", unique = true, nullable = false)
    String inn;

    @Column(name = "currency", nullable = false)
    String currency;

    @Column(name = "status_account", nullable = false)
    String statusAccount;
}
