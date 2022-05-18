package com.example.MBankTest.service.database;


import com.example.MBankTest.entity.Supplier;
import com.example.MBankTest.service.base.CrudService;

public interface SupplierService extends CrudService<Supplier> {
    Supplier getBySupplierByName(String supplierName);
}
