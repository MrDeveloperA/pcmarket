package com.example.pcmarket.projection;

import com.example.pcmarket.entity.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = PcMarket.class)
public interface CustomPcMarket {
    Integer getId();
    String getName();
    Product getProduct();
    Review getReview();
    Partner getPartner();
    Brand getBrand();
}

