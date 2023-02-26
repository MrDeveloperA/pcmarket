package com.example.pcmarket.repository;

import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomTypePayment;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "typePayment", collectionResourceRel = "list", excerptProjection = CustomTypePayment.class)
public interface TypePaymentRepository {

}
