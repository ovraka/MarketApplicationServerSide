package com.assignment.MarketApplication.dto.transaction;

import com.assignment.MarketApplication.entity.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UserCartGridDTO {

    private String documentCode;

    private String documentNumber;

    private String userId;

    private Double total;

    private Date date;
}
