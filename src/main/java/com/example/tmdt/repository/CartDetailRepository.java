package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.buyPrd.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailRepository extends BaseRepository<CartDetail>, JpaRepository<CartDetail, Long> {
}
