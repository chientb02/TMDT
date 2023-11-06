package com.example.tmdt.model.fkProduct;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.security.model.Account;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
@Data
@Entity
@Table(name = "Comment")
@EqualsAndHashCode(callSuper = false)
public class Comment extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Account account ;
}
