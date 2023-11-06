package com.example.tmdt.model.buyPrd;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.model.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
@Data
@Entity
@Table(name = "CartDetail")
@EqualsAndHashCode(callSuper = false)
public class CartDetail extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double quantity ;
    @ManyToOne
    private Product product ;
    @ManyToOne
    private Cart cart ;
}

