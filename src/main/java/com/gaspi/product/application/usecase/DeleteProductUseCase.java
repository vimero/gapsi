package com.gaspi.product.application.usecase;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import com.gaspi.product.application.domain.dto.ProductDTO;
import com.gaspi.product.application.mapper.ProductMapper;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductUseCase {

    private final PersistenceProductPort persistenceProductPort;
    private final ProductMapper productMapper;

    public void delete(String id){
        ProductEntity entity = persistenceProductPort.find(id);
        persistenceProductPort.delete(entity);
    }
}
