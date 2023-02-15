package com.project2.AdminBE.Order;

import com.project2.AdminBE.Product.Product;

import java.util.List;

public class OrderResponse {
    private String message;
    private Boolean success;
    private Long order_Id;
    private List<Product> products;

    public OrderResponse() {
    }

    public OrderResponse(String message, Boolean success, Long order_Id, List<Product> products) {
        this.message = message;
        this.success = success;
        this.order_Id = order_Id;
        this.products = products;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Long order_Id) {
        this.order_Id = order_Id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
