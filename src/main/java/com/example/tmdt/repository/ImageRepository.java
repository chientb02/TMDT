package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.fkProduct.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends BaseRepository<Image>, JpaRepository<Image, Long> {
}
