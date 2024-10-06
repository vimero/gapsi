package com.gaspi.product.application.port.input;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;

public interface PersistenceProductPort {

    ProductEntity create(ProductEntity productEntity);

}
