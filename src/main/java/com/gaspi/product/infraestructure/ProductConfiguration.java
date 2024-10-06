package com.gaspi.product.infraestructure;

import com.gaspi.product.application.usecase.CreateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    CreateProductUseCase createProductUseCase(){
        return new CreateProductUseCase();
    }

}
