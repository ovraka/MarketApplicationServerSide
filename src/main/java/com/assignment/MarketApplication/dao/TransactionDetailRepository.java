package com.assignment.MarketApplication.dao;

import com.assignment.MarketApplication.entity.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long> {

}
