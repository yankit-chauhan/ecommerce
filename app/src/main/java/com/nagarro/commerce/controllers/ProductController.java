package com.nagarro.commerce.controllers;
import com.nagarro.commerce.api.dto.ProductDTO;
import com.nagarro.commerce.api.v1.ProductsApi;
import com.nagarro.commerce.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
public class ProductController implements ProductsApi {
    private ProductService productService;
    @Override
    public ResponseEntity<ProductDTO> getById(String id){
        //service impl

        return ResponseEntity.ok().body(productService.getProductById(id));
    }
}
