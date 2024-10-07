package com.gaspi.product.application.port.input;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import com.gaspi.product.application.exception.NotFoundException;

import java.util.List;

public interface PersistenceProductPort {

    ProductEntity save(ProductEntity productEntity);
    List<ProductEntity> read();

    ProductEntity find(String id) throws NotFoundException;

    void delete(ProductEntity productEntity);

}
