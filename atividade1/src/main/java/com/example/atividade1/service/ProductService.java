package com.example.atividade1.service;

import java.util.ArrayList;

import com.example.atividade1.model.Product;
import com.example.atividade1.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository pr;
    private ArrayList<Product> list = new ArrayList<Product>();
    public Product getProductById(int id) {
        Product prod = pr.getProductById(id);
        return prod;
    }
    public ArrayList<Product> getProductsWithStock() {
        ArrayList<Product> prodList = pr.getProducts();
        this.list.clear();

        for (Product prod : prodList) {
            if(prod.getStock() > 0)
                this.list.add(prod);
        }
        return this.list;
    }
    public ArrayList<Product> getProductsByValueUp(double value){
        ArrayList<Product> prodList = pr.getProducts();
        this.list.clear();        
        for (Product prod : prodList) {
            if(prod.getPrice() > value)
                this.list.add(prod);
        }
        return this.list;
    }
    public ArrayList<Product> getProductsByValueDown(double value){
        ArrayList<Product> prodList = pr.getProducts();
        this.list.clear();        
        for (Product prod : prodList) {
            if(prod.getPrice() < value)
                this.list.add(prod);
        }
        return this.list;
    }
}