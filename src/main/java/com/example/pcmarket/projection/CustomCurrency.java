package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
}

