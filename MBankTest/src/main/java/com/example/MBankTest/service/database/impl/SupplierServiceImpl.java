package com.example.MBankTest.service.database.impl;

import com.example.MBankTest.entity.Supplier;
import com.example.MBankTest.repository.SupplierRepository;
import com.example.MBankTest.service.base.impl.CrudServiceImpl;
import com.example.MBankTest.service.database.SupplierService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SupplierServiceImpl extends CrudServiceImpl<Supplier> implements SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        super(supplierRepository);
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Supplier getBySupplierByName(String supplierName) {
        return supplierRepository.findBySupplierName(supplierName);
    }
}
