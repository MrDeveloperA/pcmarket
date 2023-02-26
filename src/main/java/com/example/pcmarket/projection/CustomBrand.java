package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Attachment;
import com.example.pcmarket.entity.Brand;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Brand.class)
public interface CustomBrand {
    Integer getId();
    String getName();
}

