package com.project2.AdminBE.Order;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_Id")
    private Long order_Id;

    @Column(name = "product_Id")
    private Long product_Id;

    @Column(name = "quantity")
    private Long quantity;

    public OrderDetails() {
    }

    public OrderDetails(Integer id, Long order_Id, Long product_Id, Long quantity) {
        this.id = id;
        this.order_Id = order_Id;
        this.product_Id = product_Id;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Long order_Id) {
        this.order_Id = order_Id;
    }

    public Long getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(Long product_Id) {
        this.product_Id = product_Id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
