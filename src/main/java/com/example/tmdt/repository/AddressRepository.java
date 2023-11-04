package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends BaseRepository<Address>, JpaRepository<Address, Long> {
}
