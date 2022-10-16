package com.assignment.MarketApplication.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTokenDTO {
    private Boolean error;
    private String message;
    private LoginResultDTO loginResult;
}
