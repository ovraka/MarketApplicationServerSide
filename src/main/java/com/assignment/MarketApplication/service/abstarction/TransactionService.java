package com.assignment.MarketApplication.service.abstarction;


import com.assignment.MarketApplication.dto.transaction.RequestTransactionDTO;
import com.assignment.MarketApplication.dto.transaction.ResponseTransactionDTO;

public interface TransactionService {
    Object confirmTransaction(RequestTransactionDTO dto, String username, String productCode, Long documentNumber);
}
