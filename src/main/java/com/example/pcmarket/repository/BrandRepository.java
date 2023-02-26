package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.projection.CustomAttachment;
import com.example.pcmarket.projection.CustomBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "brand", collectionResourceRel = "list", excerptProjection = CustomBrand.class)
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
