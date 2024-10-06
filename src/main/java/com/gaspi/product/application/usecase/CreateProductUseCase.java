package com.gaspi.product.application.usecase;

import com.gaspi.product.application.domain.dto.ProductDTO;

public class CreateProductUseCase {

    public ProductDTO create(ProductDTO productDTO){
        return new ProductDTO();
    }

}
