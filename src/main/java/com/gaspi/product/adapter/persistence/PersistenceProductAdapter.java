package com.gaspi.product.adapter.persistence;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import com.gaspi.product.adapter.persistence.mysql.repository.ProductRepository;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersistenceProductAdapter implements PersistenceProductPort {

    private final ProductRepository productRepository;

    @Override
    public ProductEntity create(ProductEntity productEntity) {
        productEntity.setId(getCode());
        return productRepository.save(productEntity);
    }

    private String getCode() {
        return String.format("P%09d" , productRepository.count() + 1);
    }

}
