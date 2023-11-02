package com.example.tmdt.model.buyPrd;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.model.Product;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
@Entity
@Table(name = "BillDetail")
@EqualsAndHashCode(callSuper = false)
public class BillDetail extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double quantity ;
    private Double price ;
    private Double total ;
    @ManyToOne
    private Product product ;
    @ManyToOne
    private Bill bill ;
}
