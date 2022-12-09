package com.project2.AdminBE.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    private long id;
    @Column(name = dop)
    private Date dop;
    @Column(name = id_Type)
    private Long id_Type;
    @Column(name = image)
    private String image;
    @Column(name = name)
    private String name;
    @Column(name = price)
    private Double price;
    @Column(name = quanlity)
    private int quanlity;
}
