package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.Product;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    Iterable<Product> findAllByCategory(Optional<Category> category);
    Page<Product> findAllByNameContaining(String name, Pageable pageable);
}
