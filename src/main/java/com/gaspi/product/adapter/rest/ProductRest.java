package com.gaspi.product.adapter.rest;


import com.gaspi.product.application.domain.dto.ProductDTO;
import com.gaspi.product.application.usecase.CreateProductUseCase;
import com.gaspi.product.application.usecase.DeleteProductUseCase;
import com.gaspi.product.application.usecase.EditProductUseCase;
import com.gaspi.product.application.usecase.ReadProductUseCase;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductRest {

    private CreateProductUseCase createProductUseCase;
    private ReadProductUseCase readProductUseCase;
    private EditProductUseCase editProductUseCase;
    private DeleteProductUseCase deleteProductUseCase;

    @GetMapping
    public List<ProductDTO> read(){
        return readProductUseCase.read();
    }

    @PutMapping("/{id}")
    public ProductDTO edit(@PathVariable("id")String id, @RequestParam String description, @RequestParam String model){
        return editProductUseCase.edit(id, description, model);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")String id){
        deleteProductUseCase.delete(id);
    }

    @PostMapping
    public ProductDTO create(@Valid @RequestBody ProductDTO request){
        return createProductUseCase.create(request);
    }

}
