package com.gaspi.product.adapter.persistence.mysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class ProductEntity {

    @Id
    private String id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 200)
    private String description;

    @Column
    private double price;

    @Column(nullable = false, length = 10)
    private String model;

}
