package com.example.MBankTest.repository;


import com.example.MBankTest.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    @Query(nativeQuery = true, value =
            "SELECT t.* FROM suppliers t " +
                    "WHERE t.supplier_name = :supplierName")
    Supplier findBySupplierName(@Param("supplierName") String supplierName);
}
