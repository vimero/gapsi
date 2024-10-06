package com.gaspi.product.infraestructure;

import com.gaspi.product.application.mapper.ProductMapper;
import com.gaspi.product.application.port.input.PersistenceProductPort;
import com.gaspi.product.application.usecase.CreateProductUseCase;
import com.gaspi.product.application.usecase.EditProductUseCase;
import com.gaspi.product.application.usecase.ReadProductUseCase;
import com.gaspi.product.application.usecase.DeleteProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    CreateProductUseCase createProductUseCase(PersistenceProductPort persistenceProductPort, ProductMapper productMapper){
        return new CreateProductUseCase(persistenceProductPort, productMapper);
    }

    @Bean
    ReadProductUseCase listProductUseCase(PersistenceProductPort persistenceProductPort, ProductMapper productMapper){
        return new ReadProductUseCase(persistenceProductPort, productMapper);
    }

    @Bean
    EditProductUseCase editProductUseCase(PersistenceProductPort persistenceProductPort, ProductMapper productMapper){
        return new EditProductUseCase(persistenceProductPort, productMapper);
    }

    @Bean
    DeleteProductUseCase deleteProductUseCase(PersistenceProductPort persistenceProductPort, ProductMapper productMapper){
        return new DeleteProductUseCase(persistenceProductPort, productMapper);
    }

}
