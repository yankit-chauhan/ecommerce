package com.nagarro.commerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data

public class ProductModel {
    private String id;
    private String name;
    private String description;
    private double price;
}
