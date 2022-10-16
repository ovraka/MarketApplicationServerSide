package com.assignment.MarketApplication.rest;

import com.assignment.MarketApplication.dto.user.*;
import com.assignment.MarketApplication.handler_exception.InternalServerError;
import com.assignment.MarketApplication.handler_exception.InvalidUsernameOrPassword;
import com.assignment.MarketApplication.service.abstarction.UserService;
import com.assignment.MarketApplication.service.utility.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtToken jwtToken;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@Valid @RequestBody RequestTokenDTO dto) {

        try {
            var springSecurityToken = new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword());
            authenticationManager.authenticate(springSecurityToken);

            String jwtGeneratedToken = jwtToken.generateToken(dto.getUsername());

            var response = new ResponseTokenDTO(
                    false,
                    "success",
                    new LoginResultDTO(dto.getUsername(), jwtGeneratedToken));
            return ResponseEntity.status(200).body(response);
        } catch (Exception exception) {
            throw new InvalidUsernameOrPassword("Invalid Username or Password");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@Valid @RequestBody RequestRegisterDTO dto) {

        try {
            ResponseRegisterDTO user = userService.registrationUser(dto);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } catch (Exception e) {

            throw new InternalServerError("There is a run-time error on the server.");
        }
    }
}
