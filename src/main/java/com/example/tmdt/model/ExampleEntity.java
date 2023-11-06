package com.example.tmdt.model;

import com.example.tmdt.core.model_base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
@Data
@Entity
@Table(name = "example")
@EqualsAndHashCode(callSuper = false)
public class ExampleEntity extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
