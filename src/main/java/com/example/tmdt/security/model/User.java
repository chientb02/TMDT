package com.example.tmdt.security.model;
import com.example.tmdt.model.Discount;
import com.example.tmdt.model.address.Address;
import javax.persistence.*;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "User")
@EqualsAndHashCode(callSuper = false)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name ;
    private String avatar ;
    private String gender ;
    private Integer age ;
    private String phone ;
    @ManyToOne
    private Address address ;
    @ManyToOne
    private Discount discount ;
    @OneToOne
    private Account account ;
    @Column(columnDefinition = "integer default 0")
    private Integer changeRole ;

}
