package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.entity.Product;
import com.poly.hangnt169.B9_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    ProductRepository repository;

    @GetMapping("/product/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("list", repository.findAll());
        // findAll => Lay ra tat ca
        // Lay 1 doi tuong =>findById
//        Product p = repository.findById(1L).orElse(null);
        Product p = repository.findById(1L).get();
        return "/buoi9/product";
    }

    @GetMapping("/product/delete/{product}")
    public String delete(@PathVariable("product") Long id) {
        repository.deleteById(id);
        return "redirect:/product/hien-thi";


    }
}
