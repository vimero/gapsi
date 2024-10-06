package com.gaspi.product.application.domain.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductDTO {

    private String id;

    @Size(min = 0, max = 20)
    private String name;

    @Size(min = 0, max = 200)
    private String description;

    private double price;

    @Size(min = 0, max = 10)
    private String model;

}
