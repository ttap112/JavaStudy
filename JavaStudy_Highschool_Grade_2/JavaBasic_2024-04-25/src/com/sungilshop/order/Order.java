package com.sungilshop.order;

import com.sungilshop.product.Product;
import com.sungilshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(Product product, User user) {
        this.user = user;
        this.product = product;
    }

}
