package com.example.webpos.model.repository;


import com.example.webpos.model.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    Optional<Product> findById(String s);

    @Override
    Iterable<Product> findAll();
}
