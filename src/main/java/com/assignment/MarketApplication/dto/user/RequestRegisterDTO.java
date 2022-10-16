package com.assignment.MarketApplication.dto.user;

import com.assignment.MarketApplication.validation.user.UniqueUsername;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Create new user")
public class RequestRegisterDTO {

    @UniqueUsername(message = "Username already exist")
    @Schema(description = "Username yang digunakan untuk register maximum 20 characters")
    @NotBlank(message = "Username is required")
    @Size(max = 20, message = "Username can't be more than 20 characters")
    private String username;

    @Schema(description = "Password yang digunakan untuk register maximum 20 characters")
    @NotBlank(message = "Password is required")
    @Size(max = 20, message = "Password can't be more than 20 characters")
    private String password;
}
