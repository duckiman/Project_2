package com.project2.AdminBE.Order;

import com.project2.AdminBE.Product.Product;

import java.util.List;

public class OrderRequest {
    private Long userId;
    private List<Product> products;

    public OrderRequest() {
    }

    public OrderRequest(Long userId, List<Product> products) {
        this.userId = userId;
        this.products = products;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
