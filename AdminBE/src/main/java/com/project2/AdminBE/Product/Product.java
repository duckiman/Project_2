package com.project2.AdminBE.Product;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @SequenceGenerator(
            name ="product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "product_sequence"
    )
    private long id;
    @Column(name = "dop")
    private Date dop;
    @Column(name = "id_Type")
    private Long id_Type;
    @Column(name = "image")
    private String image;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "quanlity")
    private int quanlity;

    public Product() {
    }

    public Product(long id, Date dop, Long id_Type, String image, String name, Double price, int quanlity) {
        this.id = id;
        this.dop = dop;
        this.id_Type = id_Type;
        this.image = image;
        this.name = name;
        this.price = price;
        this.quanlity = quanlity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDop() {
        return dop;
    }

    public void setDop(Date dop) {
        this.dop = dop;
    }

    public Long getId_Type() {
        return id_Type;
    }

    public void setId_Type(Long id_Type) {
        this.id_Type = id_Type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
}
