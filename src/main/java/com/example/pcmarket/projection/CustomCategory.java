package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
}

