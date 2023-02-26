package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Partner;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Partner.class)
public interface CustomPartner {
    Integer getId();
    String getName();
}

