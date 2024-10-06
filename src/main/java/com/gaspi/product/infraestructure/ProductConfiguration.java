package com.gaspi.product.infraestructure;

import com.gaspi.product.application.mapper.ProductMapper;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import com.gaspi.product.application.usecase.CreateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    CreateProductUseCase createProductUseCase(PersistenceProductPort persistenceProductPort, ProductMapper productMapper){
        return new CreateProductUseCase(persistenceProductPort, productMapper);
    }

}
