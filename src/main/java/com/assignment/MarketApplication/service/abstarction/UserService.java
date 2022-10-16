package com.assignment.MarketApplication.service.abstarction;

import com.assignment.MarketApplication.dto.user.RequestRegisterDTO;
import com.assignment.MarketApplication.dto.user.ResponseRegisterDTO;

public interface UserService {
    ResponseRegisterDTO registrationUser(RequestRegisterDTO dto);
    public Boolean checkExistingUser(String username);

}
