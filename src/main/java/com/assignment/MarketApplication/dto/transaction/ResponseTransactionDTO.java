package com.assignment.MarketApplication.dto.transaction;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ResponseTransactionDTO {
    private Boolean error;
    private String message;
}
