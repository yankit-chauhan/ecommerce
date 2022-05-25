package com.nagarro.commerce.api.v1;

import com.nagarro.commerce.api.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductsApi {
    @GetMapping("products/{id}")
    default ResponseEntity<ProductDTO> getById(@PathVariable  String id){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
