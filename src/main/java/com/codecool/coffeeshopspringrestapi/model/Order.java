package com.codecool.coffeeshopspringrestapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private List<Product> products = new ArrayList<>();
    private String orderDetails;
    private Client client;

    public Order() {
    }

    public Order(String orderDetails) { this.orderDetails = orderDetails; }

    public static long getSerialVersionUID() { return serialVersionUID; }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public List<Product> getProducts() { return products; }

    public void setProducts(List<Product> products) { this.products = products; }

    public String getOrderDetails() { return orderDetails; }

    public void setOrderDetails(String orderDetails) { this.orderDetails = orderDetails; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

    @Override
    public String toString() {
        return "Order [id=" + id
                + ", products=" + products
                + ", client=" + client.getFirstName() +" "+ client.getLastName()
                + ", orderDetails=" + orderDetails  + "]";
    }
}