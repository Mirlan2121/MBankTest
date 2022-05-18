package com.example.MBankTest.repository;


import com.example.MBankTest.entity.SupplierRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRoleRepository extends JpaRepository<SupplierRole, Long> {
}
