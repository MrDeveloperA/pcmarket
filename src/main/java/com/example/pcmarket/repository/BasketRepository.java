package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Basket;
import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.projection.CustomBasket;
import com.example.pcmarket.projection.CustomBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "basket", collectionResourceRel = "list", excerptProjection = CustomBasket.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
