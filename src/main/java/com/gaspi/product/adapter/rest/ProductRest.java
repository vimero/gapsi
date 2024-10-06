package com.gaspi.product.adapter.rest;


import com.gaspi.product.application.domain.dto.ProductDTO;
import com.gaspi.product.application.usecase.CreateProductUseCase;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductRest {

    private CreateProductUseCase createProductUseCase;

    @PostMapping
    public ProductDTO create(@Valid @RequestBody ProductDTO request){
        return createProductUseCase.create(request);
    }

}
