package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Review;
import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "review", collectionResourceRel = "list", excerptProjection = CustomReview.class)
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
