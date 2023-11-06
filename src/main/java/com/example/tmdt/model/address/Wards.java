package com.example.tmdt.model.address;

import com.example.tmdt.core.model_base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Wards")
@EqualsAndHashCode(callSuper = false)
public class Wards extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private District district ;
}
