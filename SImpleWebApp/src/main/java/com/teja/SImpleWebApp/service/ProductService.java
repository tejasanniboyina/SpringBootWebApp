package com.teja.SImpleWebApp.service;

import com.teja.SImpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service //also acts @Component
public class ProductService{

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",5000),
            new Product(102,"Samsung",60000),
            new Product(103,"Nokia",30000)));


    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId){
        return products.stream()
                .filter(p ->p.getProdId() == prodId)
                .findFirst().get();
    }


    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId()) index=i;
        }
        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prodId)
                index=i;
        }
        products.remove(index);
    }
}
