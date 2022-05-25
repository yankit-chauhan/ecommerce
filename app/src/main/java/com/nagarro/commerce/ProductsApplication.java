package com.nagarro.commerce;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
/**
 * TODO
 * add log4j2 dependency and remove logback dependency
 * define properties for log4j2 level
 *
 */

@SpringBootApplication
public class ProductsApplication {

    public static void main(String[] args){
        SpringApplication.run(ProductsApplication.class,args);
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
