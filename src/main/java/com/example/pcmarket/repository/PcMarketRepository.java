package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.PcMarket;
import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomPcMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "pcMarket", collectionResourceRel = "list", excerptProjection = CustomPcMarket.class)
public interface PcMarketRepository extends JpaRepository<PcMarket, Integer> {
}
