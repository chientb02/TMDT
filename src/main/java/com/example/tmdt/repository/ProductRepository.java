package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends BaseRepository<Product>, JpaRepository<Product, Long> {
}
