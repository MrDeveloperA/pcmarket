package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.Currency;
import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
