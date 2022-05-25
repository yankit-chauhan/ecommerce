package com.nagarro.commerce.services.impl;

import com.nagarro.commerce.api.dto.ProductDTO;
import com.nagarro.commerce.services.ProductService;
import com.nagarro.commerce.dataports.IProductDataPort;
import com.nagarro.commerce.models.ProductModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {
    public IProductDataPort productDataPort;

    public ModelMapper modelMapper;

    @Override
    public ProductDTO getProductById(String id) {
        Optional<ProductModel> productOptional = productDataPort.getProductById(id);
        ProductModel product = null;
        if (productOptional.isPresent()) {
            product = productOptional.get();
            log.info(product.toString());
        }




        return modelMapper.map(product, ProductDTO.class);
    }

    // dta id
    //convert
}
