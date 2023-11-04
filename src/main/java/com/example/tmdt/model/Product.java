package com.example.tmdt.model;

import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.model.fkProduct.*;
import com.example.tmdt.security.model.Account;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
@EqualsAndHashCode(callSuper = false)
public class Product extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantity;
    private String description;
    private Double price;
    private Double promotion;
    @Column(columnDefinition = "integer default 0")
    private Integer count;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comment;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Shop shop;
    @ManyToOne
    private OptionProduct option;
    @ManyToOne
    private Category category;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Image> image;
    @ManyToOne
    private Account account;
}