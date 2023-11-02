package com.example.tmdt.model;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.model.fkProduct.Shop;
import com.example.tmdt.security.model.Account;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
@Entity
@Table(name = "Chat")
@EqualsAndHashCode(callSuper = false)
public class Chat extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    private Account account ;
    @ManyToOne
    private Shop shop ;
}