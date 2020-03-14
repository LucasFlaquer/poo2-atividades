package com.example.atividade1.controller;

import java.util.ArrayList;

import com.example.atividade1.model.Product;
import com.example.atividade1.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserController
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService ps;


    @GetMapping("/produto/{id}")
    public ModelAndView getProduct(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("view");
        Product prod = ps.getProductById(id);
        mv.addObject("product", prod);
        return mv;
    }

    
    @GetMapping("/produtosEmEstoque")
    public ModelAndView getInStock()
    {
        ModelAndView mv = new ModelAndView("in-stock");
        ArrayList<Product> products = ps.getProductsWithStock();
        mv.addObject("products", products);
        return mv;
    }
    @GetMapping("/produtosValorAcima/{value}")
    public ModelAndView getInProductUp(@PathVariable("value") double value)
    {
        ModelAndView mv = new ModelAndView("biggerthan");
        ArrayList<Product> products = ps.getProductsByValueUp(value);
        mv.addObject("products", products);
        return mv;
    }
    @GetMapping("/produtosValorAbaixo/{value}")
    public ModelAndView getInProductDown(@PathVariable("value") double value)
    {
        ModelAndView mv = new ModelAndView("biggerthan");
        ArrayList<Product> products = ps.getProductsByValueDown(value);
        mv.addObject("products", products);
        return mv;
    }
}