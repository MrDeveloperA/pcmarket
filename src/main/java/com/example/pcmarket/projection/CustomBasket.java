package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Basket;
import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Basket.class)
public interface CustomBasket {
    Integer getId();
    Product getProduct();
    Integer getNumberProduct();
}

