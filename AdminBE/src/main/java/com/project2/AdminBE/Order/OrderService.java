package com.project2.AdminBE.Order;

import com.project2.AdminBE.Product.Product;
import com.project2.AdminBE.Product.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepo productRepository;

    public OrderResponse placeOrder(OrderRequest orderRequest) {
        int userId = orderRequest.getUserId();
        List<Product> products = orderRequest.getProducts();

        if (userId > 0) {
            Order order = new Order();
            order.setUser_Id(userId);
            order = orderRepository.save(order);

            for (Product product : products) {
                Optional<Product> optionalProduct = productRepository.findById(product.getId());
                if (optionalProduct.isPresent()) {
                    Product existingProduct = optionalProduct.get();
                    int inCart = product.getIn_cart();
                    int quantity = existingProduct.getQuantity();
                    quantity = quantity - inCart;
                    if (quantity < 0) {
                        quantity = 0;
                    }
                    existingProduct.setQuantity(quantity);
                    productRepository.save(existingProduct);

                    OrderDetails orderDetail = new OrderDetails();
                    orderDetail.setOrder_Id(order.getId());
                    orderDetail.setProduct_Id(product.getId());
                    orderDetail.setQuantity(inCart);
                    orderRepository.save(orderDetail);
                }
            }

            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setMessage("Order successfully placed with order id " + order.getId());
            orderResponse.setSuccess(true);
            orderResponse.setOrder_Id(order.getId());
            orderResponse.setProducts(products);
            return orderResponse;
        } else {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setMessage("New order failed");
            orderResponse.setSuccess(false);
            return orderResponse;
        }
    }
}