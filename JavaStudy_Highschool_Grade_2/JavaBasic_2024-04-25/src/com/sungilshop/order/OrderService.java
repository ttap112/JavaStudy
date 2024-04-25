package com.sungilshop.order;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.sungilshop.product.Product;
import com.sungilshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(product,user);
    }
}
