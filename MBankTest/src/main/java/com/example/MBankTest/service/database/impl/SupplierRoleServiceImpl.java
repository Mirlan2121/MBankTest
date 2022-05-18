package com.example.MBankTest.service.database.impl;


import com.example.MBankTest.entity.SupplierRole;
import com.example.MBankTest.repository.SupplierRoleRepository;
import com.example.MBankTest.service.base.impl.CrudServiceImpl;
import com.example.MBankTest.service.database.SupplierRoleService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SupplierRoleServiceImpl extends CrudServiceImpl<SupplierRole> implements SupplierRoleService {
    @Autowired
    SupplierRoleRepository supplierRoleRepository;

    public SupplierRoleServiceImpl(SupplierRoleRepository supplierRoleRepository) {
        super(supplierRoleRepository);
        this.supplierRoleRepository = supplierRoleRepository;
    }
}
