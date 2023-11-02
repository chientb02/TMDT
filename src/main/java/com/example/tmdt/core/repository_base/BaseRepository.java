package com.example.tmdt.core.repository_base;


import com.example.tmdt.core.model_base.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> {

}
