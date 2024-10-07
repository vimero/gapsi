package com.gaspi.product.application.usecase;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import com.gaspi.product.application.domain.dto.ProductDTO;
import com.gaspi.product.application.exception.NotFoundException;
import com.gaspi.product.application.mapper.ProductMapper;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EditProductUseCase {

    private final PersistenceProductPort persistenceProductPort;
    private final ProductMapper productMapper;

    public ProductDTO edit(String id, String description, String model) throws NotFoundException {
        ProductEntity entity = persistenceProductPort.find(id);
        entity.setDescription(description);
        entity.setModel(model);
        return productMapper.toDTO(persistenceProductPort.save(entity));
    }
}
