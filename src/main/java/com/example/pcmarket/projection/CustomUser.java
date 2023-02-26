package com.example.pcmarket.projection;

import com.example.pcmarket.entity.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getAddress();
    String getPhoneNumber();
    String getEmail();
    Basket getBasket();
    Currency getCurrency();
    TypePayment getTypePayment();
}

