package com.teja.SImpleWebApp.service;

import com.teja.SImpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service //also acts @Component
public class ProductService{

    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",5000),
            new Product(102,"Samsung",60000),
            new Product(103,"Nokia",30000));
    public List<Product> getProducts(){

        return products;

    }


    public Product getProductById(int prodId){
        return products.stream()
                .filter(p ->p.getProId() == prodId)
                .findFirst().get();
    }






}
