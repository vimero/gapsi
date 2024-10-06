package com.gaspi.product.application.usecase;

import com.gaspi.product.application.domain.dto.ProductDTO;
import com.gaspi.product.application.mapper.ProductMapper;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ReadProductUseCase {

    private final PersistenceProductPort persistenceProductPort;
    private final ProductMapper productMapper;

    public List<ProductDTO> read(){
        return productMapper.toDTOList(persistenceProductPort.read());
    }

}
