package com.example.atividade1.controller;

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
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService ps;


    @GetMapping("/{id}")
    public ModelAndView getProduct(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("view");
        Product prod = ps.getProductById(id);
        mv.addObject("product", prod);
        return mv;
    }
}