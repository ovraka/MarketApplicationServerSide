package com.assignment.MarketApplication.dao;

import com.assignment.MarketApplication.dto.transaction.UserCartGridDTO;
import com.assignment.MarketApplication.entity.TransactionHeader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHeaderRepository extends JpaRepository<TransactionHeader, String> {
//
//    @Query("""
//            SELECT com.assignment.MarketApplication.dto.transaction.UserCartGridDTO
//            ()
//            FROM TransactionHeader AS th
//                JOIN th.user AS ui
//            WHERE tr.documentCode LIKE %:documentCode%
//            AND (:userId IS NULL OR th.userId = :username)
//            """)
//    Page<UserCartGridDTO> getCart(@Param("username") String user, @Param("documentCode") String documentCode, Pageable pageable);

}
