package com.gaspi.product.application.port.input;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;

import java.util.List;

public interface PersistenceProductPort {

    ProductEntity save(ProductEntity productEntity);
    List<ProductEntity> read();

    ProductEntity find(String id);

    void delete(ProductEntity productEntity);

}
