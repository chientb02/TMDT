package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.address.Address;
import com.example.tmdt.model.buyPrd.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDetailRepository extends BaseRepository<BillDetail>, JpaRepository<BillDetail, Long> {
}
