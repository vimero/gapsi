package com.gaspi.product.adapter.persistence.mysql.repository;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductEntity, String>{
}
