package com.project2.AdminBE.Product;


import javax.persistence.*;


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
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "cat_Id")
    private Long cat_Id;
    @Column(name = "image")
    private String image;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "quantity")
    private int quantity;

    public Product() {
    }

    public Product(Long id, String description, Long cat_Id, String image, String name, Double price, int quantity) {
        this.id = id;
        this.description = description;
        this.cat_Id = cat_Id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCat_Id() {
        return cat_Id;
    }

    public void setCat_Id(Long cat_Id) {
        this.cat_Id = cat_Id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
