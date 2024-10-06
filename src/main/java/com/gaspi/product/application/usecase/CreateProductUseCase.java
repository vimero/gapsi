package com.gaspi.product.application.usecase;

import com.gaspi.product.application.domain.dto.ProductDTO;
import com.gaspi.product.application.mapper.ProductMapper;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductUseCase {

    private final PersistenceProductPort persistenceProductPort;
    private final ProductMapper productMapper;

    public ProductDTO create(ProductDTO productDTO){
        return productMapper.toDTO(persistenceProductPort.create(productMapper.toEntity(productDTO)));
    }

}
