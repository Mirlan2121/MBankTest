package com.example.MBankTest.entity;

import com.example.MBankTest.entity.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Supplier extends BaseEntity {

    @Column(name = "supplier_name", unique = true, nullable = false)
    String supplierName;

    @Column(name = "supplier_code", unique = true, nullable = false)
    String supplierCode;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "is_active", nullable = false)
    Long isActive;
}
