package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService extends IGeneralService<Product>{
    Page<Product> findAll(Pageable pageable);

    Iterable<Product> findAllByCategory(Optional<Category> category);

    Page<Product> findAllByNameContaining(String name, Pageable pageable);
}
