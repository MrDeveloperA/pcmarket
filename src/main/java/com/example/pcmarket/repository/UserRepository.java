package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Brand;
import com.example.pcmarket.entity.User;
import com.example.pcmarket.projection.CustomBrand;
import com.example.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
