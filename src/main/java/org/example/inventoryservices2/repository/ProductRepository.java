package org.example.inventoryservices2.repository;

import org.example.inventoryservices2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,String> {
}
