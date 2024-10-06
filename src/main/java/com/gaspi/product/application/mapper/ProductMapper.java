package com.gaspi.product.application.mapper;

import com.gaspi.product.adapter.persistence.mysql.entity.ProductEntity;
import com.gaspi.product.application.domain.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    ProductEntity toEntity(ProductDTO productDTO);
    ProductDTO toDTO(ProductEntity productEntity);

}
