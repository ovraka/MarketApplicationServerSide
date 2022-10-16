package com.assignment.MarketApplication.service.implementation;

import com.assignment.MarketApplication.dao.ProductRepository;
import com.assignment.MarketApplication.dao.TransactionDetailRepository;
import com.assignment.MarketApplication.dao.TransactionHeaderRepository;
import com.assignment.MarketApplication.dao.UserRepository;
import com.assignment.MarketApplication.dto.transaction.RequestTransactionDTO;
import com.assignment.MarketApplication.entity.Product;
import com.assignment.MarketApplication.entity.TransactionDetail;
import com.assignment.MarketApplication.entity.TransactionHeader;
import com.assignment.MarketApplication.entity.User;
import com.assignment.MarketApplication.service.abstarction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TrasactionSeviceImpl{

    @Autowired
    TransactionHeaderRepository transactionHeaderRepository;

    @Autowired
    TransactionDetailRepository transactionDetailRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

}
