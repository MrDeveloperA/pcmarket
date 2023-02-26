package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Product;
import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
