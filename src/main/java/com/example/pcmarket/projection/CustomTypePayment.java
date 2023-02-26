package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.TypePayment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = TypePayment.class)
public interface CustomTypePayment {
    Integer getId();
    String getName();
}

