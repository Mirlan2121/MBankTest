package com.example.MBankTest.boot;


import com.example.MBankTest.entity.Account;
import com.example.MBankTest.entity.Role;
import com.example.MBankTest.entity.Supplier;
import com.example.MBankTest.entity.SupplierRole;
import com.example.MBankTest.service.database.AccountService;
import com.example.MBankTest.service.database.RoleService;
import com.example.MBankTest.service.database.SupplierRoleService;
import com.example.MBankTest.service.database.SupplierService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApplicationStartRunner implements CommandLineRunner {
    @Autowired
    RoleService roleService;

    @Autowired
    SupplierRoleService supplierRoleService;

    @Autowired
    AccountService accountService;

    @Autowired
    SupplierService supplierService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        Role role = roleService.saveOrUpdate(Role.builder()
                .nameRole("ROLE_USER")
                .build());

        roleService.saveOrUpdate(Role.builder()
                .nameRole("ROLE_ADMIN")
                .build());

        Supplier supplier = supplierService.saveOrUpdate(Supplier.builder()
                .supplierName("MPC")
                .password(passwordEncoder.encode("MPC"))
                .supplierCode("1234567890098765")
                .isActive(1L)
                .build());

        supplierRoleService.saveOrUpdate(SupplierRole.builder()
                .supplier(supplier)
                .role(role)
                .build());

//        supplier = supplierService.saveOrUpdate(Supplier.builder()
//                .supplierName("")
//                .password(passwordEncoder.encode(""))
//                .supplierCode("")
//                .isActive(1L)
//                .build());
//
//        supplierRoleService.saveOrUpdate(SupplierRole.builder()
//                .supplier(supplier)
//                .role(role)
//                .build());

        accountService.saveOrUpdate(Account.builder()
                .accountCode("2131231411231231")
                .amount(BigDecimal.ZERO)
                .fullName("Эрик.у.Мирлан")
                .inn("89548976054612")
                .currency("KGS")
                .statusAccount("0")
                .build());

        accountService.saveOrUpdate(Account.builder()
                .accountCode("121232323")
                .amount(BigDecimal.valueOf(100.1))
                .fullName("A.Y.R")
                .inn("2103912393")
                .currency("KGS")
                .statusAccount("0")
                .build());
    }
}
