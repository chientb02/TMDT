package com.example.tmdt.model.buyPrd;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.security.model.Account;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Bill")
@EqualsAndHashCode(callSuper = false)
public class Bill extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Account account ;
    private String address;
    private String phone;
    private String total;
    private LocalDate date ;
}
