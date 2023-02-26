package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Review;
import com.example.pcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Review.class)
public interface CustomReview {
    Integer getId();
    Integer getStar();
    User getUser();
    String getMessage();
}

