package com.example.MBankTest.repository;


import com.example.MBankTest.entity.PaymentDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDocumentRepository extends JpaRepository<PaymentDocument, Long> {
    @Query(nativeQuery = true, value =
            "SELECT t.* FROM payment_documents t " +
                    "WHERE t.document_number = :documentNumber AND t.type = :type")
    PaymentDocument getByDocumentNumber(@Param("documentNumber") String documentNumber, @Param("type") String type);
}
