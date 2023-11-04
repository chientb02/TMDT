package com.example.tmdt.repository;
import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.fkProduct.OptionProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends BaseRepository<OptionProduct>, JpaRepository<OptionProduct, Long> {
}
