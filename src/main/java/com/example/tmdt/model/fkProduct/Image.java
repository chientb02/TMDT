package com.example.tmdt.model.fkProduct;
import com.example.tmdt.core.model_base.BaseEntity;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "Image")
@EqualsAndHashCode(callSuper = false)
public class Image extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}

