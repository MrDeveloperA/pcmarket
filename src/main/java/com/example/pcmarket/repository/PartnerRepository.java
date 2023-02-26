package com.example.pcmarket.repository;

import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomPartner;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "partner", collectionResourceRel = "list", excerptProjection = CustomPartner.class)
public interface PartnerRepository {
}
