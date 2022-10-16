package com.assignment.MarketApplication.service.implementation;

import com.assignment.MarketApplication.ApplicationUserDetails;
import com.assignment.MarketApplication.dao.UserRepository;
import com.assignment.MarketApplication.dto.user.RequestRegisterDTO;
import com.assignment.MarketApplication.dto.user.ResponseRegisterDTO;
import com.assignment.MarketApplication.entity.User;
import com.assignment.MarketApplication.service.abstarction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ResponseRegisterDTO registrationUser(RequestRegisterDTO dto) {
        String hashPassword = passwordEncoder.encode(dto.getPassword());
        var account = new User(
                dto.getUsername(),
                hashPassword
        );
        userRepository.save(account);

        ResponseRegisterDTO responseRegisterDTO = new ResponseRegisterDTO(false, "User created");

        return responseRegisterDTO;
    }

    @Override
    public Boolean checkExistingUser(String username) {
        var existingUser = userRepository.countUsername(username);
        return (existingUser > 0) ? true : false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userRepository.findById(username).get();
        var userDetail = new ApplicationUserDetails(user);
        return userDetail;
    }
}
