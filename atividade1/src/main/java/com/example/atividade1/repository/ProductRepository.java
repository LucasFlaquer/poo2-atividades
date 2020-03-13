package com.example.atividade1.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.atividade1.model.Product;

import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public class ProductRepository {

    public HashMap<Integer, Product> hm = new HashMap<Integer, Product>();

    public ProductRepository() {
        hm.put(1, new Product(1, "Super Monitor", 1200.50, 10));
        hm.put(2, new Product(2, "Camiseta Nike", 62.6, 2));
        hm.put(3, new Product(3, "Controle PS3", 61.6, 10));
        hm.put(4, new Product(4, "fone de ouvido", 64.6, 20));
        hm.put(5, new Product(5, "porta", 3.6, 30));
        hm.put(6, new Product(6, "Controle PS4", 263.6, 12));
        hm.put(7, new Product(7, "salgado", 3.8, 8));
        hm.put(8, new Product(8, "mousepad", 44.6, 1));
        hm.put(9, new Product(9, "fonte de notebook", 63.6, 13));
        hm.put(0, new Product(10, "cabo carregador de celular", 63.6, 60));
    }

    public Product getProductById(int id) {
        return hm.get(id);
    }
    public ArrayList<Product> getProducts() {
       return new ArrayList<Product>(hm.values());
    }

}