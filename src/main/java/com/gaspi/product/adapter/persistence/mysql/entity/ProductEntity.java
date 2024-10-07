package com.gaspi.product.adapter.persistence.mysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    private String id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false, length = 10)
    private String model;

    @Column(nullable = false)
    private boolean active;

}
