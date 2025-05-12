package com.thefreedevelopers.spring_mvc_tutorial.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String productName;
    private double unitPrice;

    //Add ManyToOne relationship to Category model
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    // Empty constructor
    public Product() {
    }

    // Constructor with initial values
    public Product(String productName, double unitPrice, Category category) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
