package com.nagarro.commerce.dataports;

import com.nagarro.commerce.models.ProductModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
//TODO
// refactor package name and class name take service package reference

@Repository
public class ProductDataPort implements IProductDataPort {
    //list<ProductModel> class
    //list of product
    public static List<ProductModel> products = new ArrayList<>();
    //prepare data
    public List<ProductModel> preData() {
        products.add(new ProductModel("1","iphone","it is a mobile phone",1000));
        products.add(new ProductModel("2","sumsung","it is a mobile phone",2000));
        return products;
    }
    @Override
    public Optional<ProductModel> getProductById(String id){
            if(CollectionUtils.isEmpty(products)){
                products = preData();
            }

            //find my data
        return products.stream().filter(p -> id.equals(p.getId())).findFirst();
    }
}
