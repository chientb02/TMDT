package com.example.tmdt.model.fkProduct;
import com.example.tmdt.core.model_base.BaseEntity;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
@Entity
@Table(name = "Category")
@EqualsAndHashCode(callSuper = false)
public class Category extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}