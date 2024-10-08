package com.gaspi.product.adapter.persistence;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import com.gaspi.product.adapter.persistence.mysql.repository.ProductRepository;
import com.gaspi.product.application.exception.NotFoundException;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersistenceProductAdapter implements PersistenceProductPort {

    private final ProductRepository productRepository;

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        if( productEntity.getId() == null ) {
            productEntity.setId(getCode());
            productEntity.setActive(true);
        }
        return productRepository.save(productEntity);
    }

    @Override
    public List<ProductEntity> read() {
        return productRepository.findByActiveTrue();
    }

    @Override
    public ProductEntity find(String id) throws NotFoundException {
        return productRepository.findById(id).orElseThrow(() -> new NotFoundException("Product " +id + " not found"));
    }

    @Override
    public void delete(ProductEntity productEntity) {
        productEntity.setActive(false);
        productRepository.save(productEntity);
    }

    private String getCode() {
        return String.format("P%09d" , productRepository.count() + 1);
    }

}
