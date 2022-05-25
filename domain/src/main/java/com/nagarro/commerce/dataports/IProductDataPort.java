package com.nagarro.commerce.dataports;

import com.nagarro.commerce.models.ProductModel;

import java.util.Optional;

public interface IProductDataPort {
    Optional<ProductModel> getProductById(String id);
}
