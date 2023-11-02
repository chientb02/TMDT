package com.example.tmdt.core.mapper_base;


import com.example.tmdt.dto.ExampleDTO;
import com.example.tmdt.model.ExampleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ExampleMapper extends EntityMapper<ExampleDTO, ExampleEntity> {
}
