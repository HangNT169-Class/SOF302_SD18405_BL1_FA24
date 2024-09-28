package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @GetMapping("/category/hien-thi")
    public String hienThiCategory(Model model) {
        model.addAttribute("listCategory", repository.findAll());
        // add/ update
//        repository.save(doi tuong);
        // delete
//        repository.delete(doi tuong);
//        repository.deleteById(khoa chinh);
        return "/buoi9/category";
    }
}
