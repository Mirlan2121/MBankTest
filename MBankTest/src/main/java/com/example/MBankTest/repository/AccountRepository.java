package com.example.MBankTest.repository;


import com.example.MBankTest.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(nativeQuery = true, value =
            "SELECT t.* FROM accounts t " +
                    "WHERE t.account_code = :accountCode ")
    Account findAccountByAccountCode(@Param("accountCode") String accountCode);
}
