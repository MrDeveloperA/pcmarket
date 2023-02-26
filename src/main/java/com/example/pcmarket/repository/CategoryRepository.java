package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Category;
import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
