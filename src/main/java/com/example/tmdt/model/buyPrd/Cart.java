package com.example.tmdt.model.buyPrd;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.security.model.Account;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
@Data
@Entity
@Table(name = "Cart")
@EqualsAndHashCode(callSuper = false)
public class Cart extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String confirm;
    @ManyToOne
    private Account account ;
}

