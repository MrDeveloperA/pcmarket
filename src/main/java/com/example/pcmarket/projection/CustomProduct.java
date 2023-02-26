package com.example.pcmarket.projection;

import com.example.pcmarket.entity.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    Attachment getAttachment();
    String getDescription();
    Integer getPrice();
    Brand getBrand();
    Review getReview();
    Category getCategory();
}

